package com.belrose.springbootmapstruct.repository;

import com.belrose.springbootmapstruct.model.Product;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductRepository extends ReactiveMongoRepository<Product,String> {
}
