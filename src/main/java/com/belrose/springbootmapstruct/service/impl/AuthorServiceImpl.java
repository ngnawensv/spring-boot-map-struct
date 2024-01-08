package com.belrose.springbootmapstruct.service.impl;

import com.belrose.springbootmapstruct.dto.AuthorDto;
import com.belrose.springbootmapstruct.repository.AuthorRepository;
import com.belrose.springbootmapstruct.service.AuthorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public String saveAuthor(AuthorDto authorDto) {
       // log.info("author mapped from authorDto {}",authorDto);
       // log.info("Book mapped from authorDto {}",book);

        //var authorSave= authorRepository.save(author).block();
      //  log.info("author Save in mongodb {}",authorSave);

       // return String.format("Author name: %s and Book title: %s",authorDto.getAuthorAge(),authorDto.getAuthorName());
        return "";

    }
}
