package com.joalvarez.simpleexampleapi;

import com.joalvarez.simpleexampleapi.config.AppBaseProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication
@EnableSpringDataWebSupport(pageSerializationMode = EnableSpringDataWebSupport.PageSerializationMode.VIA_DTO)
@EnableConfigurationProperties({AppBaseProperties.class})
public class SimpleExampleApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleExampleApiApplication.class, args);
    }
}