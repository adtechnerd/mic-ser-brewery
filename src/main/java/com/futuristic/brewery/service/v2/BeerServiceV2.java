package com.futuristic.brewery.service.v2;

import com.futuristic.brewery.web.model.v2.BeerDtoV2;

import java.util.UUID;

/**
 * aditya created on 25/01/20
 */
public interface BeerServiceV2 {
    BeerDtoV2 createService(UUID beerId);

    BeerDtoV2 saveBeer(BeerDtoV2 beerDtoV2);

    BeerDtoV2 updateBeer(BeerDtoV2 beerDtoV2);

    void deleteBeer(UUID beerId);
}
