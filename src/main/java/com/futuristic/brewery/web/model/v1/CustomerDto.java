package com.futuristic.brewery.web.model.v1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.UUID;

/**
 * aditya created on 24/01/20
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {

    @NotNull
    @NotBlank
    @Size(min = 3, max = 100)
    private String name;
    private UUID id;
}
