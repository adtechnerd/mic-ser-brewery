package com.futuristic.brewery.service;

import com.futuristic.brewery.web.model.CustomerDto;

import java.util.UUID;

/**
 * aditya created on 24/01/20
 */
public interface CustomerService {

    CustomerDto getCustomer(UUID id);
}