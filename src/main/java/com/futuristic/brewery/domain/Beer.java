package com.futuristic.brewery.domain;

import com.futuristic.brewery.web.model.v2.BeerStyle;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.UUID;

/**
 * aditya created on 09/02/20
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Beer {

    private UUID id;
    private String beerName;
    private String beerStyle;
    private Long upc;

    private Timestamp createdDate;
    private Timestamp lastUpdatedDate;
}
