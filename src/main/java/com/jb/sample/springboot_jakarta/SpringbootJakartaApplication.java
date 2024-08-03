package com.jb.sample.springboot_jakarta;

import jakarta.inject.Inject;
import jakarta.ws.rs.core.UriInfo;
import org.glassfish.jersey.process.internal.RequestScoped;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class SpringbootJakartaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJakartaApplication.class, args);
	}



}