package com.green.showppingmall.customer;

import com.green.showppingmall.customer.model.CustomerInsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{

    private final CustomerMapper mapper;
    @Autowired
    public CustomerServiceImpl(CustomerMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int inscus(CustomerInsDto dto) {

        return mapper.inscus(dto);
    }
}
