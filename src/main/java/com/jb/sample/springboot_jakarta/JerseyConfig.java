package com.jb.sample.springboot_jakarta;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JerseyConfig  {

    @Bean
    public ResourceConfig jerseyConfiguration() {
        ResourceConfig resourceConfig = new ResourceConfig();
        resourceConfig.packages("com.jb.sample.springboot_jakarta"); // Adjust to your package structure
        resourceConfig.register(UriInfoFilter.class); // Register your filter
        return resourceConfig;
    }
}