package com.green.showppingmall.customer;

import com.green.showppingmall.customer.model.CustomerInsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/*
   /customer 고객
    (post) 회원가입

 */@RestController
@RequestMapping("/customer")


public class CustomerController {
    private final CustomerService service;

    @Autowired
    public CustomerController(CustomerServiceImpl service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Integer> inscus(@RequestBody CustomerInsDto dto){
        int result = service.inscus(dto);
        return ResponseEntity.ok(result);
    }
}
