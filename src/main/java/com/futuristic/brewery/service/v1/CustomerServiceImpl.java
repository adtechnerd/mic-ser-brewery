package com.futuristic.brewery.service.v1;

import com.futuristic.brewery.web.model.v1.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * aditya created on 24/01/20
 */
@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getCustomer(UUID id) {
        return CustomerDto.builder().id(UUID.randomUUID()).name("King").build();
    }

    @Override
    public CustomerDto addCustomer(CustomerDto customerDto) {
        return CustomerDto.builder().name(customerDto.getName()).id(UUID.randomUUID()).build();
    }

    @Override
    public CustomerDto updateCustomer(UUID id, CustomerDto customerDto) {
        return CustomerDto.builder().name(customerDto.getName()).id(customerDto.getId()).build();
    }

    @Override
    public void deleteCustomer(UUID id) {
        log.debug("deleting customer");
    }
}
