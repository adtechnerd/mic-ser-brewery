package com.futuristic.brewery.service.v1;

import com.futuristic.brewery.web.model.v1.BeerDto;

import java.util.UUID;

/**
 * aditya created on 24/01/20
 */
public interface BeerService {

    BeerDto getBeerById(UUID beerId);

    // adding a new Beer object
    BeerDto saveNewBeer(BeerDto beerDto);

    void updateBeer(UUID beerId, BeerDto beerDto);

    void deleteById(UUID beerId);
}
