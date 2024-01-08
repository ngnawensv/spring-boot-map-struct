package com.belrose.springbootmapstruct.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.io.Serializable;

@Data
public class AuthorDto implements Serializable {
    @NotBlank(message = "Author Name is mandatory field")
    private String authorName;
    private Integer authorAge;
    private String title;
}
