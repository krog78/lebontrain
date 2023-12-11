package org.lebontrain.journey;

import java.util.Set;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/journey")
public class JourneyResource {

    @RestClient
    JourneyService journeyService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Set<Object> fromNantesToAngers() {        
        return journeyService.getJourneysByOriginAndDestination("stop_area:STE:OCE87481002", "stop_area:STE:OCE87484006");
    }
}
