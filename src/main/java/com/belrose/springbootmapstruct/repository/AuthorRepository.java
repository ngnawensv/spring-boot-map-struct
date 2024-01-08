package com.belrose.springbootmapstruct.repository;

import com.belrose.springbootmapstruct.model.Author;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends ReactiveMongoRepository<Author,String> {
}
