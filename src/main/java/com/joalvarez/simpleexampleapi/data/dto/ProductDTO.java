package com.joalvarez.simpleexampleapi.data.dto;

import com.joalvarez.simpleexampleapi.data.dto.general.BaseDTO;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.time.LocalDateTime;
import java.util.UUID;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public record ProductDTO(
  UUID id,
  String sku,
  String name,
  String description,
  String category,
  int stock,
  boolean active,
  LocalDateTime createdAt,
  LocalDateTime updateAt
) implements BaseDTO {}
