package com.joalvarez.simpleexampleapi.exception.products;

public class ProductExistsException extends RuntimeException{

	private final int internalCode;
	private final String internalMessage;
	private final String message;

	public ProductExistsException(String productSku) {
		this.internalCode = 4004;
		this.internalMessage = String.format("product with sku %s already exists", productSku);
		this.message = "product with the entered SKU already exists";
	}

	public int getInternalCode() {
		return internalCode;
	}

	public String getInternalMessage() {
		return internalMessage;
	}

	@Override
	public String getMessage() {
		return message;
	}
}
