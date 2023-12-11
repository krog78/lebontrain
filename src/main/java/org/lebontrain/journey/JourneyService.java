package org.lebontrain.journey;

import org.eclipse.microprofile.rest.client.annotation.ClientHeaderParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import java.util.Set;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

@Path("/coverage/fr-nw/journeys")
@RegisterRestClient(configKey="navitia-api")
@ClientHeaderParam(name = "Authorization", value = "f5d04fbf-aa81-4396-8dc8-3288a3477bd2")
public interface JourneyService {

    @GET
    Set<Object> getJourneysByOriginAndDestination(@QueryParam("from") String from, @QueryParam("to") String to);
}
