package com.joalvarez.simpleexampleapi.config;

import com.joalvarez.simpleexampleapi.data.dto.general.BaseDTO;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "app")
public record AppBaseProperties(
	String version,
	String description,
	String name
) implements BaseDTO {}