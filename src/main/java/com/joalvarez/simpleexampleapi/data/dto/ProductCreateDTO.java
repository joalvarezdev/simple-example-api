package com.joalvarez.simpleexampleapi.data.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.joalvarez.simpleexampleapi.data.dto.general.BaseDTO;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public record ProductCreateDTO(
	@NotBlank(message = "sku field cannot be null or empty")
	String sku,
	@NotBlank(message = "name field cannot be null or empty")
	String name,
	@NotBlank(message = "description field cannot be null or empty")
	String description,
	@NotNull(message = "price field cannot be null")
	@Min(value = 1, message = "price field min value is 1")
	Integer price,
	String category
) implements BaseDTO {}
