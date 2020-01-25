package com.futuristic.brewery.service.v2;

import com.futuristic.brewery.service.v2.BeerServiceV2;
import com.futuristic.brewery.web.model.v2.BeerDtoV2;
import com.futuristic.brewery.web.model.v2.BeerStyle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * aditya created on 25/01/20
 */
@Service
@Slf4j
public class BeerServiceV2Impl implements BeerServiceV2 {

    @Override
    public BeerDtoV2 createService(UUID beerId) {
        return BeerDtoV2.builder().beerName("King2").beerStyle(BeerStyle.MADIRA).uuid(UUID.randomUUID()).build();
    }

    @Override
    public BeerDtoV2 saveBeer(BeerDtoV2 beerDtoV2) {
        return beerDtoV2.builder().uuid(UUID.randomUUID()).beerStyle(beerDtoV2.getBeerStyle()).beerName(beerDtoV2.getBeerName()).uupc(beerDtoV2.getUupc()).build();
    }

    @Override
    public BeerDtoV2 updateBeer(BeerDtoV2 beerDtoV2) {
        return beerDtoV2.builder().uupc(beerDtoV2.getUupc()).beerName(beerDtoV2.getBeerName()).beerStyle(beerDtoV2.getBeerStyle()).uuid(beerDtoV2.getUuid()).build();
    }

    @Override
    public void deleteBeer(UUID beerId) {
        log.debug("deleting beer: " + beerId);
    }
}
