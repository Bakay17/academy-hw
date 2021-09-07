package org.example.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Date;

@Path("/time")
public class TimeService {

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Response getTime() {
        Date date = new Date();

        return Response.ok()
                .entity(date.getHours() + ":" + date.getMinutes())
                .build();
    }
}
