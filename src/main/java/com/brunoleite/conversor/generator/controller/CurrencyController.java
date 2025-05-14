package com.brunoleite.conversor.generator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.brunoleite.conversor.generator.service.CurrencyService;


@RestController
@RequestMapping("/api/currency")
public class CurrencyController {

    @Autowired
    private CurrencyService currencyService;

	
    @GetMapping("/convert")
    public ResponseEntity<Double> convertCurrency(
            @RequestParam double amount,
            @RequestParam String from,
            @RequestParam String to) {
		
		/*try {
			double convertedValue = currencyService.convertCurrency(amount, from.toUpperCase(), to.toUpperCase());
			return ResponseEntity.ok(convertedValue);
		} catch(Exception e) {
			return ResponseEntity.badRequest().body("Error: " + e.getMessage());
		}*/
    	
    	double convertedAmount = currencyService.convertCurrency(amount, from, to);
        
        return ResponseEntity.ok(convertedAmount);
	}
	
}
