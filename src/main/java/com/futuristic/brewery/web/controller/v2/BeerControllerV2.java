package com.futuristic.brewery.web.controller.v2;

import com.futuristic.brewery.service.v2.BeerServiceV2;
import com.futuristic.brewery.web.model.v2.BeerDtoV2;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.ServerRequest;

import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * aditya created on 25/01/20
 */
@Validated
@RestController
@RequestMapping("api/v2/beer")
public class BeerControllerV2 {

    private BeerServiceV2 beerServiceV2;

    public BeerControllerV2(BeerServiceV2 beerServiceV2) {
        this.beerServiceV2 = beerServiceV2;
    }

    @GetMapping({"/{beerId}"})
    public ResponseEntity<BeerDtoV2> getBeer(@PathVariable("beerId") UUID beerId) {
        BeerDtoV2 dtoV2 = beerServiceV2.createService(beerId);
        return new ResponseEntity<>(dtoV2, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity postBeer(@Valid @RequestBody BeerDtoV2 beerDtoV2) {
        BeerDtoV2 savedBeer = beerServiceV2.saveBeer(beerDtoV2);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "api/v2/beer"+savedBeer.getUuid().toString());

        return new ResponseEntity(headers, HttpStatus.CREATED);
    }

    @PutMapping({"/{beerId}"})
    public ResponseEntity putBeer(@PathVariable("beerId") UUID beerId, @Valid @RequestBody BeerDtoV2 beerDtoV2) {
        BeerDtoV2 updatedBeer = beerServiceV2.updateBeer(beerDtoV2);

        return new ResponseEntity(HttpStatus.ACCEPTED);
    }

    @DeleteMapping({"/{beerId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeer(@PathVariable("beerId") UUID beerId) {
        beerServiceV2.deleteBeer(beerId);
    }

}
