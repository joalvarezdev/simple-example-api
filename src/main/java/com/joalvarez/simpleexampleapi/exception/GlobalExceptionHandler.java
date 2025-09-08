package com.joalvarez.simpleexampleapi.exception;

import com.joalvarez.simpleexampleapi.data.dto.general.ResponseDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.joalvarez.simpleexampleapi.exception.dto.ResponseErrorDTO;
import com.joalvarez.simpleexampleapi.exception.products.ProductExistsException;
import com.joalvarez.simpleexampleapi.shared.LoggerHelper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.stream.Stream;

@RestControllerAdvice
public class GlobalExceptionHandler implements LoggerHelper {

    private final ObjectMapper mapper;

    public GlobalExceptionHandler(ObjectMapper mapper) {
        this.mapper = mapper;
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ResponseDTO> handleValidationExceptions(MethodArgumentNotValidException e) throws JsonProcessingException {
        final Stream<ObjectError> errors = e.getBindingResult().getAllErrors().stream().filter(FieldError.class::isInstance);

        final JsonNode details = this.mapper.readTree(
                this.mapper.writeValueAsString(errors.map(FieldError.class::cast)
                        .map(
                                (error) -> String.format("The field {} is invalid for the value {} with the following cause: %s", error.getField(), error.getRejectedValue(), error.getDefaultMessage())
                        )
                        .toList()));

        return ResponseEntity
                .badRequest()
                .body(
                        new ResponseDTO(
                                String.valueOf(HttpStatus.BAD_REQUEST.value()),
                                "Some fields are invalid, check details",
                                details
                        )
                );
    }

	@ExceptionHandler(GenericException.class)
	public ResponseEntity<ResponseErrorDTO> handler(GenericException exception) {

		this.warn(exception.getInternalMessage());

		return ResponseEntity.status(exception.getStatus()).body(
			new ResponseErrorDTO(
				(long) exception.getCode(),
				exception.getInternalMessage(),
				exception.getMessage(),
				LocalDateTime.now()
			)
		);
	}
}