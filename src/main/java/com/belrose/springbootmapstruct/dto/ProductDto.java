package com.belrose.springbootmapstruct.dto;

import com.belrose.springbootmapstruct.model.Item;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.List;

@Data
public class ProductDto implements Serializable {
    private String name;
    private String description;
    private int quantity;
    private long price;
    private String itemId; //itemId is generated value using UUID
    private List<Item> itemList;
}
