package com.joalvarez.simpleexampleapi.exception.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.joalvarez.simpleexampleapi.data.dto.general.BaseDTO;

import java.time.LocalDateTime;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public record ResponseErrorDTO(
	Long internalCode,
	String internalMessage,
	String message,
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	LocalDateTime timestamp
) implements BaseDTO {}
