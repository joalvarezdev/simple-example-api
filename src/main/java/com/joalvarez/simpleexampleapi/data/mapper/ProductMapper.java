package com.joalvarez.simpleexampleapi.data.mapper;

import com.joalvarez.simpleexampleapi.data.domain.Product;
import com.joalvarez.simpleexampleapi.data.dto.ProductCreateDTO;
import com.joalvarez.simpleexampleapi.data.dto.ProductDTO;
import com.joalvarez.simpleexampleapi.data.mapper.general.BaseMapper;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.joalvarez.simpleexampleapi.utils.Price;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class ProductMapper extends BaseMapper<ProductDTO, Product> {

    public ProductMapper(ObjectMapper mapper) {
        super(mapper);
    }

	@Override
	public ProductDTO toDTO(Product entity) {
		return new ProductDTO(
			entity.getId(),
			entity.getSku(),
			entity.getName(),
			entity.getDescription(),
			entity.getCategory(),
			entity.getStock(),
			entity.isActive(),
			Price.fromDisplay(entity.getPrice()),
			entity.getCreatedAt(),
			entity.getUpdatedAt()
		);
	}

	@Override
	public Product fromDTO(ProductDTO entity) {
		Product product = super.fromDTO(entity);

		product.setPrice(Price.toDatabase(entity.price()));

		return product;
	}

	public ProductDTO toProductDTO(ProductCreateDTO dto) {
		return new ProductDTO(
			null,
			dto.sku(),
			dto.name(),
			dto.description(),
			dto.category(),
			0,
			true,
			dto.price(),
			LocalDateTime.now(),
			null
		);
	}
}
