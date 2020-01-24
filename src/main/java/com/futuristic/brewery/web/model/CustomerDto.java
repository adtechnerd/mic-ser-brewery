package com.futuristic.brewery.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * aditya created on 24/01/20
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {

    private String name;
    private UUID id;
}
