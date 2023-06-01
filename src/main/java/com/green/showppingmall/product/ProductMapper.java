package com.green.showppingmall.product;

import com.green.showppingmall.product.model.ProductDto;
import com.green.showppingmall.product.model.ProductEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductMapper {

    int inspro(ProductEntity entity);
}
