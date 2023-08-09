package com.spring.bank.infra.rest.model;

import com.spring.bank.domain.entities.Country;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.LinkedHashMap;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class WorldBankResponse {

    private List<LinkedHashMap<String, Object>> page;
    private List<Country> countries;

}
