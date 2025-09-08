package com.joalvarez.simpleexampleapi.exception.products;

import com.joalvarez.simpleexampleapi.exception.GenericException;
import org.springframework.http.HttpStatus;

public class ProductExistsException extends GenericException {

	public ProductExistsException(String sku) {
		super(
			HttpStatus.CONFLICT,
			4009,
			String.format("product with sku %s already exists", sku),
			"product with the entered SKU already exists"
		);
	}
}