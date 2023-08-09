package org.bank.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.bank.application.services.CountryService;
import org.bank.domain.entities.Country;

import java.util.List;

@Path("/country")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CountryController {

    @Inject
    CountryService countryService;

    @GET
    @Path("")
    public List<Country> listAll() {
        return countryService.listAll();
    }

    @GET()
    @Path("{countryId}")
    public Country findById(@PathParam("countryId") String countryId) {
        return countryService.findById(countryId);
    }

}