package org.bank.application.services;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import org.bank.application.interfaces.CountryInterface;
import org.bank.domain.entities.Country;

import java.util.List;

@Singleton
public class CountryService {

    @Inject
    CountryInterface countryInterface;

    public Country findById(String countryId) {
        return countryInterface.findById(countryId);
    }

    public List<Country> listAll() {
        return countryInterface.listAll();
    }
}
