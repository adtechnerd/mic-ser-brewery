package com.futuristic.brewery.service.v1;

import com.futuristic.brewery.web.model.v1.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * aditya created on 24/01/20
 */
@Service
@Slf4j
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID()).beerName("King").beerStyle("kingdom").build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder().id(UUID.randomUUID()).beerStyle(beerDto.getBeerStyle()).beerName(beerDto.getBeerName()).build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        //todo: add implementation
    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("Deleting entity");
    }
}
