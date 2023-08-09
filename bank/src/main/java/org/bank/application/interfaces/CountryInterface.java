package org.bank.application.interfaces;

import org.bank.domain.entities.Country;

import java.util.List;

public interface CountryInterface {

    Country findById(String id);

    List<Country> listAll();

}