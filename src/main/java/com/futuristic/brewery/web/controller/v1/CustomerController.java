package com.futuristic.brewery.web.controller.v1;

import com.futuristic.brewery.service.v1.CustomerService;
import com.futuristic.brewery.web.model.v1.CustomerDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * aditya created on 24/01/20
 */
@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping({"/{id}"})
    public ResponseEntity<CustomerDto> getCustomer(@PathVariable("id") UUID id) {
        return new ResponseEntity<>(customerService.getCustomer(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity addCustomer(@RequestBody CustomerDto customerDto) {
        CustomerDto savedCustomer = customerService.addCustomer(customerDto);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "api/v1/customer"+savedCustomer.getId().toString());
        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

    @PutMapping({"/{id}"})
    public ResponseEntity updateCustomer(@PathVariable("id") UUID id, @RequestBody CustomerDto customerDto) {
        CustomerDto dto = customerService.updateCustomer(id, customerDto);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping({"/{id}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCustomer(@PathVariable("id") UUID id) {
        customerService.deleteCustomer(id);
    }

}
