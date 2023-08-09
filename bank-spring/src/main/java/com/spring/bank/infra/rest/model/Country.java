package com.spring.bank.infra.rest.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@XmlRootElement
//@JsonIgnoreProperties
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Country {
    private String id;
    private String iso2Code;
    private String name;
    private Region region;
    private Region adminregion;
    private IncomeLevel incomeLevel;
    private LendingType lendingType;
    private String capitalCity;
    private String longitude;
    private String latitude;

    // Getters e Setters
}