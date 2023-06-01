package com.green.showppingmall.customer;

import com.green.showppingmall.customer.model.CustomerInsDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CustomerMapper {

    int inscus(CustomerInsDto dto);
}
