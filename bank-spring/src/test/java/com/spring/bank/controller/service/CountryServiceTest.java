package com.spring.bank.controller.service;


import com.spring.bank.application.interfaces.CountryInterface;
import com.spring.bank.application.services.CountryService;
import com.spring.bank.controller.CountryController;
import com.spring.bank.domain.entities.Country;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.internal.verification.VerificationModeFactory.times;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class CountryServiceTest {

    @Mock
    private CountryInterface countryInterface;

    @InjectMocks
    private CountryService countryService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testFindCountryById() {
        Country expectedCountry = new Country("ABW", "Aruba", "Aruba");
        when(countryInterface.findById("ABW")).thenReturn(expectedCountry);

        Country actualCountry = countryService.findById("ABW");

        assertEquals(expectedCountry, actualCountry);
        verify(countryInterface, times(1)).findById("ABW");
    }

    @Test
    public void testListAllCountries() {
        List<Country> expectedCountries = new ArrayList<>();
        expectedCountries.add(new Country("ABW", "Aruba", "Aruba"));
        expectedCountries.add(new Country("AFE", "Africa Eastern and Southern", "Africa Eastern and Southern"));

        when(countryInterface.listAll()).thenReturn(expectedCountries);

        List<Country> actualCountries = countryService.listAll();

        assertEquals(expectedCountries, actualCountries);
        verify(countryInterface, times(1)).listAll();
    }
}