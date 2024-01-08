package com.belrose.springbootmapstruct.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Document(collection = "books")
public class Book implements Serializable {
    private String id;
    private String title;
}
