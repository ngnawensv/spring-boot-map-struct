package com.belrose.springbootmapstruct.mapper;

import com.belrose.springbootmapstruct.dto.AuthorDto;
import com.belrose.springbootmapstruct.model.Author;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface AuthorMapper {
   @Mapping(target = "authorName", source = "model.name")
   @Mapping(target = "authorAge", source = "model.age")
   AuthorDto modelToDto(Author model);

    @Mapping(target = "name", source = "dto.authorName")
    @Mapping(target = "age", source = "dto.authorAge")
    Author dtoToModel(AuthorDto dto);
}
