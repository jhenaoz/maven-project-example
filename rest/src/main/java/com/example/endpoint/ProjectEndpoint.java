package com.example.endpoint;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * Created by jhenaoz on 10/30/16.
 */
@Path("/api")
public class ProjectEndpoint {
    @GET
    @Path(value = "/program")
    public Response getPrograms(){
        String output = "hola mundo";
        return Response.status(200).entity(output).build();
    }
}
