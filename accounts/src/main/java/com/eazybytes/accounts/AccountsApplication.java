package com.eazybytes.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*
//The below three lines of code helps if your controller, entity, repository classes are in different packages
@ComponentScans({ @ComponentScan("com.eazybytes.accounts.controller") })
* @EnableJpaRepositories("com.eazybytes.accounts.repository")
* @EntityScan("com.eazybytes.accounts.entity")
* */
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Accounts microservice REST API Documentation",
				description = "Eazybank Accounts microservice REST API Documentation",
				version = "1.0",
				contact = @Contact(
						name = "Sai Teja",
						email = "info@saiteja.io",
						url = "saiteja.io"
		),license = @License(
				name = "Apache 2.0",
				url = "https://www.apache.org/licenses/LICENSE-2.0"
		)
		), externalDocs = @ExternalDocumentation(
		description = "Find out more about Eazybank",
		url = "https://saiteja.io"
)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}


}
