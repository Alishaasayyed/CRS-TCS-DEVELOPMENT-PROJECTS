package com.tcs.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@EnableJpaRepositories("com.tcs.repository")
@EntityScan("com.tcs.entity")
@ComponentScan({"com.tcs.*"})
@EnableWebMvc
@EnableAutoConfiguration
@SpringBootApplication
public class TcsCrsBSpringRestJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TcsCrsBSpringRestJpaApplication.class, args);
	}

}
