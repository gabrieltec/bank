package com.spring.bank.controller;

import com.spring.bank.application.services.CountryService;
import com.spring.bank.domain.entities.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/country")
public class CountryController {

    @Autowired
    CountryService countryService;

    @GetMapping("")
    public List<Country> listAll() {
        return countryService.listAll();
    }

    @GetMapping("{countryId}")
    public Country findById(@PathVariable("countryId") String countryId) {
        return countryService.findById(countryId);
    }

}