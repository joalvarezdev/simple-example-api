package com.joalvarez.simpleexampleapi.service;

import com.joalvarez.simpleexampleapi.data.dao.ProductDAO;
import com.joalvarez.simpleexampleapi.data.domain.Product;
import com.joalvarez.simpleexampleapi.data.dto.ProductDTO;
import com.joalvarez.simpleexampleapi.data.mapper.ProductMapper;
import com.joalvarez.simpleexampleapi.service.general.BaseService;

import org.springframework.stereotype.Service;
import java.util.Set;
import java.util.UUID;

@Service
public class ProductService
        extends BaseService<
                ProductDAO,
                ProductMapper,
                ProductDTO,
                Product,
	UUID> {

    public ProductService(ProductDAO dao, ProductMapper mapper) {
        super(dao, mapper);
    }

    @Override
    protected Set<String> validFields() {
        return Set.of();
    }
}