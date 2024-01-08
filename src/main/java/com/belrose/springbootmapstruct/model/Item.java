package com.belrose.springbootmapstruct.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Item implements Serializable {
    private int id;
    private String name;
}
