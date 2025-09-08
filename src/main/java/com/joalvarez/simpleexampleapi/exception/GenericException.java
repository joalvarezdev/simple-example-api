package com.joalvarez.simpleexampleapi.exception;

import org.springframework.http.HttpStatus;

public class GenericException extends RuntimeException {

	private final HttpStatus status;
	private final int code;
	private final String internalMessage;
	private final String message;

	public GenericException(HttpStatus status, int code, String message, String internalMessage) {
		super(message);
		this.status = status;
		this.code = code;
		this.message = message;
		this.internalMessage = internalMessage;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public int getCode() {
		return code;
	}

	public String getInternalMessage() {
		return internalMessage;
	}

	@Override
	public String getMessage() {
		return message;
	}
}