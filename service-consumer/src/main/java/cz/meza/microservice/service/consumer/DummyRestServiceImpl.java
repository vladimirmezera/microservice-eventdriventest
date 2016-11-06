package cz.meza.microservice.service.consumer;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Only test simple REST service.
 */
@Path("/dummy")
public class DummyRestServiceImpl {


   @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response sayHello() {
        return Response.ok("Hello word").build();
    }
}
