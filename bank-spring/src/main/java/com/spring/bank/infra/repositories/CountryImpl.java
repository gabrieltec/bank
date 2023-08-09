package com.spring.bank.infra.repositories;

import com.spring.bank.application.interfaces.CountryInterface;
import com.spring.bank.domain.entities.Country;
import com.spring.bank.infra.rest.CountryRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryImpl implements CountryInterface {

    @Autowired
    private CountryRest countryRest;

    @Override
    public Country findById(String id) {
        return this.countryRest.searchByCountryCode(id);
    }

    @Override
    public List<Country> listAll() {
        return this.countryRest.listAllCountry();
    }

}
