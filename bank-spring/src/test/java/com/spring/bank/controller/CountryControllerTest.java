package com.spring.bank.controller;


import com.spring.bank.application.services.CountryService;
import com.spring.bank.domain.entities.Country;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(CountryController.class)
public class CountryControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CountryService countryService;

    @Test
    public void testListAllCountries() throws Exception {
        List<Country> countries = new ArrayList<>();
        countries.add(new Country("ABW", "Aruba", "Aruba"));
        countries.add(new Country("AFE", "Africa Eastern and Southern", "Africa Eastern and Southern"));

        when(countryService.listAll()).thenReturn(countries);

        mockMvc.perform(get("/country")).andExpect(status().isOk())
                .andExpect(jsonPath("$").isArray())
                .andExpect(jsonPath("$.length()").value(countries.size()));
    }

    @Test
    public void testFindCountryById() throws Exception {
        Country country = new Country("ABW", "Aruba", "Aruba");

        when(countryService.findById("ABW")).thenReturn(country);

        mockMvc.perform(get("/country/ABW")).andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(country.id()))
                .andExpect(jsonPath("$.name").value(country.name()));
    }
}