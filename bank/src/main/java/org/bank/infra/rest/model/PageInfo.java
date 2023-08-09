package org.bank.infra.rest.model;

import jakarta.xml.bind.annotation.XmlRootElement;
import org.bank.domain.entities.Country;

import java.util.List;

@XmlRootElement
public record PageInfo(
        int page,
        int pages,
        String per_page,
        int total,
        List<Country> countries

) {
}
