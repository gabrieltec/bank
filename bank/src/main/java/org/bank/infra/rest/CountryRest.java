package org.bank.infra.rest;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import org.bank.domain.entities.Country;
import org.bank.infra.rest.client.ICountry;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.List;

@Singleton
public class CountryRest {

    @Inject
    @RestClient
    ICountry iCountry;

    public List<Country> listAllCountry() {
        return this.iCountry.listAllCountry();

    }

    public Country searchByCountryCode(String idCountry) {
        return this.iCountry.searchByCountryCode(idCountry);
    }
}
