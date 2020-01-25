package com.futuristic.brewery.web.model.v2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * aditya created on 25/01/20
 */
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class BeerDtoV2 {
    private String beerName;
    private String uupc;
    private UUID uuid;
    private BeerStyle beerStyle;
}
