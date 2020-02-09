package com.futuristic.brewery.web.mappers;

import com.futuristic.brewery.domain.Beer;
import com.futuristic.brewery.web.model.v1.BeerDto;
import org.mapstruct.Mapper;

/**
 * aditya created on 09/02/20
 */
@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}
