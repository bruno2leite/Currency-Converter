package com.brunoleite.conversor.generator.service;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Map;

@Service
public class CurrencyService {

	private final RestTemplate restTemplate = new RestTemplate();
	
	public double convertCurrency(double amount, String from, String to) {
		String url = UriComponentsBuilder.newInstance()
				.scheme("https")
				.host("economia.awesomeapi.com.br")
				.path("/last/" + from + "-" + to)
				.toUriString();
		
		ResponseEntity<Map<String, Map<String, String>>> responseEntity = restTemplate.exchange(
		        url,
		        HttpMethod.GET,
		        null,
		        new ParameterizedTypeReference<Map<String, Map<String, String>>>() {}
		);

		Map<String, Map<String, String>> response = responseEntity.getBody();

		
		String key = from + to;
		if(response == null || !response.containsKey(key)) {
			throw new RuntimeException("Invalid currency pair or not found");
		
		}

		double rate = Double.parseDouble(response.get(key).get("bid"));
		return amount * rate;
	}
}
