package com.belrose.springbootmapstruct.controller;

import com.belrose.springbootmapstruct.dto.ProductDto;
import com.belrose.springbootmapstruct.mapper.ProductMapper;
import com.belrose.springbootmapstruct.model.Product;
import com.belrose.springbootmapstruct.repository.ProductRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ProductController {
    private final ProductMapper productMapper;
    private final ProductRepository productRepository;


    public ProductController(ProductMapper productMapper, ProductRepository productRepository) {
        this.productMapper = productMapper;
        this.productRepository = productRepository;
    }

    @PostMapping("/products")
    public ResponseEntity<Product> save (@RequestBody ProductDto productDto){
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(productRepository.save(productMapper.dtoToModel(productDto)).block());
    }

    @GetMapping("/products")
    public ResponseEntity<List<ProductDto>> findAll (){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(productMapper.modelsToDtos(productRepository.findAll().toStream().toList()));
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<ProductDto> findById (@PathVariable (value = "id") String id){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(productMapper.modelToDto(productRepository.findById(id).block()));
    }

    @DeleteMapping("/products/{itemId}")
    public ResponseEntity<String> deleteById (@PathVariable (value = "itemId") String itemId){
        productRepository.deleteById(itemId).block();
        return ResponseEntity
                .status(HttpStatus.OK).body(String.format("Product with %s successfully deleted...",itemId));
    }
}
