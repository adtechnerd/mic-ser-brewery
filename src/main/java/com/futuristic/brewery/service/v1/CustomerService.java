package com.futuristic.brewery.service.v1;

import com.futuristic.brewery.web.model.v1.CustomerDto;

import java.util.UUID;

/**
 * aditya created on 24/01/20
 */
public interface CustomerService {

    CustomerDto getCustomer(UUID id);

    CustomerDto addCustomer(CustomerDto customerDto);

    CustomerDto updateCustomer(UUID id, CustomerDto customerDto);

    void deleteCustomer(UUID id);
}
