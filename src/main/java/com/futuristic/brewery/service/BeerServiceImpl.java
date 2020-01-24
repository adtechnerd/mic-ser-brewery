package com.futuristic.brewery.service;

import com.futuristic.brewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * aditya created on 24/01/20
 */
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID()).beerName("King").beerStyle("kingdom").build();
    }
}
