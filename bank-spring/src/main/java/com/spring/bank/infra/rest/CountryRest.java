package com.spring.bank.infra.rest;

import com.spring.bank.domain.entities.Country;
import com.spring.bank.infra.rest.client.ICountryFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CountryRest {

    @Autowired
    ICountryFeign iCountryFeign;

    public List<Country> listAllCountry() {
        return (List<Country>) this.iCountryFeign.listAllCountry();
    }

    public Country searchByCountryCode(String idCountry) {
        return this.iCountryFeign.searchByCountryCode(idCountry);
    }
}
