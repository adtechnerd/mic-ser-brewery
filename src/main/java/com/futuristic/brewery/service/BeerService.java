package com.futuristic.brewery.service;

import com.futuristic.brewery.web.model.BeerDto;

import java.util.UUID;

/**
 * aditya created on 24/01/20
 */
public interface BeerService {

    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);
}
