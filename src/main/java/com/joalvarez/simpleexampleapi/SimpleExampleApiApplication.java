package com.joalvarez.simpleexampleapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication
@EnableSpringDataWebSupport(pageSerializationMode = EnableSpringDataWebSupport.PageSerializationMode.VIA_DTO)
@ConfigurationPropertiesScan(basePackages = {"com.joalvarez.simpleexampleapi.config"})
public class SimpleExampleApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleExampleApiApplication.class, args);
    }
}