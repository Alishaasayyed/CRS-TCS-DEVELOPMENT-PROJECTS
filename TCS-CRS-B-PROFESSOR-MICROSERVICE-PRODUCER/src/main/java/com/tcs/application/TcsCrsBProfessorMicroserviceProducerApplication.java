package com.tcs.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@ComponentScan({"com.tcs.*"})
@EnableAutoConfiguration
@EnableWebMvc
@EnableDiscoveryClient
@EnableJpaRepositories("com.tcs.repository")
@EntityScan("com.tcs.entity")
public class TcsCrsBProfessorMicroserviceProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TcsCrsBProfessorMicroserviceProducerApplication.class, args);
	}

}
