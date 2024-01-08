package com.belrose.springbootmapstruct.model;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Document( collection = "authors")
public class Author implements Serializable {
    @Id
    private String id;
    private String name;
    private Integer age;
    private String title;
}
