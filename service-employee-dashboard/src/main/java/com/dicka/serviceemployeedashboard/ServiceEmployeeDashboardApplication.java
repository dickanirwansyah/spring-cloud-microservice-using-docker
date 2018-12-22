package com.dicka.serviceemployeedashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ServiceEmployeeDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceEmployeeDashboardApplication.class, args);
	}

	/** konfigurasi rest template **/
	@Bean
	public RestTemplate configRestTemplate(RestTemplateBuilder restBuilder){
		return restBuilder.build();
	}
}

