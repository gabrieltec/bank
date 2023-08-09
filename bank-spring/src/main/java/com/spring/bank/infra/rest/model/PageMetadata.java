package com.spring.bank.infra.rest.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PageMetadata {
    private Integer page;
    private Integer pages;
    private String per_page;
    private Integer total;

}
