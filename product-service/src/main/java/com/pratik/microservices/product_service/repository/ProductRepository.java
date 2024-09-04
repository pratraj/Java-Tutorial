package com.pratik.microservices.product_service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pratik.microservices.product_service.modal.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}
