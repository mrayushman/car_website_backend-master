# Backend for a Car Sales company

Develop REST and GraphQL APIs, also focuses on how to secure, consume, document, and test those APIs and web services. The API documentation is developed using Swagger.

## Overview

The Car Backend consists of four modules:


1. boogle-maps: This is a Mock SPI that simulates a Maps    WebService where, given a latitude and longitude, it  will return a random address.

2. eurekaServer: Its a simple eureka server application that holds all information about the client-service applications. All micro-services will register to this eureka server and all client application will register to this server so that it knows what client applications are on which port and IP address

3. pricing-service: Its a micro-service registered to the Eureka server that simulates a backend that would store and retrieve the price of a vehicle given a vehicle id as input.

4. vehicles-api: Its a micro-service registered to the Eureka server. It maintains the vehicle data and provides a complete view of vehicle details including price and address. The API documentation is done for this service.

 
