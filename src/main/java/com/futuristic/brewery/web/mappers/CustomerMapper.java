package com.futuristic.brewery.web.mappers;

import com.futuristic.brewery.domain.Customer;
import com.futuristic.brewery.web.model.v1.CustomerDto;
import org.mapstruct.Mapper;

/**
 * aditya created on 09/02/20
 */
@Mapper
public interface CustomerMapper {

    Customer mapCustomerDtoToCustomer(CustomerDto customerDto);

    CustomerDto mapCustomerDtoToCustomer(Customer customer);
}
