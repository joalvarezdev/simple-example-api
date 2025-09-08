package com.joalvarez.simpleexampleapi.controller;

import com.joalvarez.simpleexampleapi.data.dao.ProductDAO;
import com.joalvarez.simpleexampleapi.data.domain.Product;
import com.joalvarez.simpleexampleapi.data.dto.ProductDTO;
import com.joalvarez.simpleexampleapi.data.mapper.ProductMapper;
import com.joalvarez.simpleexampleapi.service.ProductService;
import com.joalvarez.simpleexampleapi.controller.general.BasicController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("products")
public class ProductController extends BasicController<ProductService, ProductDAO, ProductMapper, ProductDTO, Product, UUID> {

    public ProductController(ProductService service) {
        super(service);
    }

	@GetMapping("{id}")
	public ProductDTO getById(@PathVariable UUID id) {
		return this.service.getById(id);
	}
}