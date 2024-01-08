package com.belrose.springbootmapstruct.mapper;

import com.belrose.springbootmapstruct.dto.ProductDto;
import com.belrose.springbootmapstruct.model.Product;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.UUID;

//componentModel = "spring" this attribute will annotate the productMapper as a component
@Mapper(componentModel = "spring", imports = UUID.class) //imports = UUID.class is used to generate value
public interface ProductMapper {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);
    @Mapping(source = "model.desc",target = "description",defaultValue = "description")
    @Mapping(target = "itemId",expression = "java(UUID.randomUUID().toString())") //Using to generate random value
    @Mapping(source = "model.items", target = "itemList")
    ProductDto modelToDto(Product model);

    @Mapping(source = "model.desc",target = "description",defaultValue = "description")
    List<ProductDto> modelsToDtos(List<Product> model);

    //Instead using the @Mapping here you can use  @InheritInverseConfiguration annotation
    //@Mapping(source = "dto.description",target = "desc",defaultValue = "description")
    @InheritInverseConfiguration
    Product dtoToModel(ProductDto dto);
}
