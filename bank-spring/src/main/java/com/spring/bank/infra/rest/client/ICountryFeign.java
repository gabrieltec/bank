package com.spring.bank.infra.rest.client;

import com.spring.bank.domain.entities.Country;
import com.spring.bank.infra.rest.model.WorldBankResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "countryFeign", url = "${org.country.endpoint}")
public interface ICountryFeign {

    @GetMapping(path = "/{idCountry}/indicator/SI.POV.DDAY?format=json", produces = "application/json")
    Country searchByCountryCode(@PathVariable("idCountry") String idCountry);

    @GetMapping(path = "?format=json", produces = "application/json", consumes = "application/json")
    List<?> listAllCountry();
}
