package com.joalvarez.simpleexampleapi.data.mapper;

import com.joalvarez.simpleexampleapi.data.domain.Product;
import com.joalvarez.simpleexampleapi.data.dto.ProductDTO;
import com.joalvarez.simpleexampleapi.data.mapper.general.BaseMapper;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.stereotype.Component;

@Component
public class ProductMapper extends BaseMapper<ProductDTO, Product> {

    public ProductMapper(ObjectMapper mapper) {
        super(mapper);
    }
}
