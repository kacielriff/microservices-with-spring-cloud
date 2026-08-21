//package com.kacielriff.api_gateway.config;
//
//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class ApiGatewayConfig {
//
//    @Bean
//    public RouteLocator gatewayRouter(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route(p -> p
//                        .path("/api/v1/book-service/**")
//                        .uri("lb://book-service"))
//
//                .route(p -> p
//                        .path("/api/v1/exchange-service/**")
//                        .uri("lb://exchange-service"))
//
//                .build();
//    }
//
//}
