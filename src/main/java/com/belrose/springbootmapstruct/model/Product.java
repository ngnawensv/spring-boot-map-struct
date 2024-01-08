package com.belrose.springbootmapstruct.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;

@Data
@Document( collection = "products")
public class Product implements Serializable {
    @Id
    private String id;
    private String name;
    private String desc;
    private String quantity;
    private long price;
    private String itemId; //itemId is generated value using UUID
    private List<Item> items;
}
