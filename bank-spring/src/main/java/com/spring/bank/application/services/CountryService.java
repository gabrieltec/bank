package com.spring.bank.application.services;

import com.spring.bank.application.interfaces.CountryInterface;
import com.spring.bank.domain.entities.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    CountryInterface countryInterface;

    public Country findById(String countryId) {
        return this.countryInterface.findById(countryId);
    }

    public List<Country> listAll() {
        return this.countryInterface.listAll();
    }
}
