package com.belrose.springbootmapstruct.mapper;

import com.belrose.springbootmapstruct.dto.AuthorDto;
import com.belrose.springbootmapstruct.model.Author;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AuthorMapperTest {
   /* AuthorMapper mapper = Mappers.getMapper(AuthorMapper.class);
    @Test
    public void givenAuthorDtowithDiffNametoAuthor_whenMaps_thenCorrect() {
        AuthorDto dto = new AuthorDto();
        dto.setAuthorName("Sam");
        dto.setAuthorAge(12);

        Author entity = mapper.authorDtotoAuthor(dto);

        assertEquals(dto.getAuthorName(), entity.getName());
        assertEquals(dto.getAuthorAge(), entity.getAge());
    }*/
}
