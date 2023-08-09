package org.bank.infra.repositories;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import org.bank.application.interfaces.CountryInterface;
import org.bank.domain.entities.Country;
import org.bank.infra.rest.CountryRest;

import java.util.List;

@Singleton
public class CountryImpl implements CountryInterface {

    @Inject
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
