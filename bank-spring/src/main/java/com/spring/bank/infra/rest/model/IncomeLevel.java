package com.spring.bank.infra.rest.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class IncomeLevel {
    private String id;
    private String iso2code;
    private String value;

}
