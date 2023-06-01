package com.green.showppingmall.product;

import com.green.showppingmall.product.model.ProductDto;
import com.green.showppingmall.product.model.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class productService {

    private final ProductMapper mapper;
@Autowired
    public productService(ProductMapper mapper) {
        this.mapper = mapper;
    }
    public int inspro(MultipartFile mainPicFile){
        ProductEntity entity = new ProductEntity();
    return 0;
    }


}
