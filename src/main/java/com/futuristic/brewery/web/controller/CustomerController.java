package com.futuristic.brewery.web.controller;

import com.futuristic.brewery.service.CustomerService;
import com.futuristic.brewery.web.model.CustomerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * aditya created on 24/01/20
 */
@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping({"/{id}"})
    public ResponseEntity<CustomerDto> getCustomer(@PathVariable("id") UUID id) {
        return new ResponseEntity<>(customerService.getCustomer(id), HttpStatus.OK);
    }
}
