package org.example.service;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/numbers-sum")
public class TwoNumberService {

    @POST
    @Path("/{num1}/{num2}")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response getNumbersSum(@PathParam("num1") int num1, @PathParam("num2") int num2) {
        int sum = num1 + num2;
        return Response.ok()
                .entity(num1 + " + " + num2 + " = " + sum)
                .build();
    }
}
