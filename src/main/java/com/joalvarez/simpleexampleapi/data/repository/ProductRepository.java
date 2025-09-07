package com.joalvarez.simpleexampleapi.data.repository;

import com.joalvarez.simpleexampleapi.data.domain.Product;
import com.joalvarez.simpleexampleapi.data.repository.general.GenericRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProductRepository extends GenericRepository<Product, UUID> {}
