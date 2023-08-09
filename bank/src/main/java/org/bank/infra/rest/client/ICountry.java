package org.bank.infra.rest.client;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.bank.domain.entities.Country;
import org.bank.infra.rest.model.CountryData;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import java.util.List;

@Path("v2/country")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@RegisterRestClient(baseUri = "http://api.worldbank.org/")
public interface ICountry {

    @GET
    @Path("/{idCountry}/indicator/SI.POV.DDAY?format=json")
    Country searchByCountryCode(@PathParam("idCountry") String idCountry);

    @GET
    @Path("?format=json")
    List<Country> listAllCountry();
}
