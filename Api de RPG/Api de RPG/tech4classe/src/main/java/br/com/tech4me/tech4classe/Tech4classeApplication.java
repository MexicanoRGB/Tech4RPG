package br.com.tech4me.tech4classe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Tech4classeApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tech4classeApplication.class, args);
	}

}
