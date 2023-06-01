package com.green.showppingmall.product;

import com.green.showppingmall.product.model.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
    private final ProductMapper service;
    @Autowired
    public ProductController(ProductMapper service) {
        this.service = service;
    }
    public int inspro(@RequestBody ProductDto dto){
        return service.inspro(dto);
    }

}
