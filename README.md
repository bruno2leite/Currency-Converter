# Currency Converter API

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)

This is a REST API project developed in Java using the Spring Boot framework.  
The main goal of this application is to convert currency amounts from a source currency to a target currency.

## 💻 Technologies Used

- Java 17
- Spring Boot 3.4.5
- Maven
- Spring Web

## 🎯 Features

- Currency conversion (e.g., USD -> BRL).
- JSON response format.
- Layered architecture (Controller, Service).

## 🔥 How to Run

### Prerequisites

- Java 17 installed.
- Maven installed.

### Steps

Clone the repository:

```bash
git clone https://github.com/bruno2leite/Currency-Converter.git
cd Currency-Converter
```

Build the project:

```bash
mvn clean install
```

Run the application:

```bash
mvn spring-boot:run
```

The application will start on the default port **8080**.

## 🔗 How to Use the API

### Currency Conversion Endpoint

**GET** `/api/currency/convert`

### Parameters

| Parameter | Type   | Description                   | Required |
|-----------|--------|-------------------------------|----------|
| amount    | double | Amount to convert              | Yes      |
| from      | String | Source currency code (e.g., USD) | Yes   |
| to        | String | Target currency code (e.g., BRL) | Yes   |

### Example Request

```
http://localhost:8080/api/currency/convert?amount=100&from=USD&to=BRL
```

### Example Response

```json
{
    "convertedAmount": 500.0
}
```


## 👨‍💻 Author

Bruno Leite  
[LinkedIn](https://www.linkedin.com/in/brunoprestesleite)
