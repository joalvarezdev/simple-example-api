package com.joalvarez.simpleexampleapi.data.dao;

import com.joalvarez.simpleexampleapi.data.domain.Product;
import com.joalvarez.simpleexampleapi.data.repository.ProductRepository;
import com.joalvarez.simpleexampleapi.data.dao.general.BaseDAO;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;
import java.util.Map;
import java.util.UUID;
import java.util.function.Function;

@Component
public class ProductDAO extends BaseDAO<ProductRepository, Product, UUID> {

    public ProductDAO(ProductRepository repository) {
        super(repository);
    }

    @Override
    protected Map<String, Function<String, Specification<Product>>> filterProcessors() {
      return Map.of();
    }

	public boolean existsProductBySKU(String sku) {
		return this.repository.existsBySku(sku);
	}
}