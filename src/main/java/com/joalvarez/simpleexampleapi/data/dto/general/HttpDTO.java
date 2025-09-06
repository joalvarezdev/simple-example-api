package com.joalvarez.simpleexampleapi.data.dto.general;

import java.util.List;

public record HttpDTO (int code, String message, List<String> details, String nested) implements BaseDTO {}
