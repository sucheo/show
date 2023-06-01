package com.green.showppingmall.customer;

import com.green.showppingmall.customer.model.CustomerInsDto;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {
    int inscus(CustomerInsDto dto);
}
