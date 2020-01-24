package com.futuristic.brewery.service;

import com.futuristic.brewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * aditya created on 24/01/20
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getCustomer(UUID id) {
        return CustomerDto.builder().id(UUID.randomUUID()).name("King").build();
    }
}
