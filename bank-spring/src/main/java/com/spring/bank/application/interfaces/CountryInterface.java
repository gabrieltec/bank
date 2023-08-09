package com.spring.bank.application.interfaces;

import com.spring.bank.domain.entities.Country;

import java.util.List;

public interface CountryInterface {

    Country findById(String id);

    List<Country> listAll();

}