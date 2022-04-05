package com.example.gateway

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@EnableEurekaClient
@SpringBootApplication
class GatewayApplication {

	static void main(String[] args) {
		SpringApplication.run(GatewayApplication, args)
	}

}
