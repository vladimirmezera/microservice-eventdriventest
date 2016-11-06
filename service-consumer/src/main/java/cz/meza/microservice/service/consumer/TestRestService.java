package cz.meza.microservice.service.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/test")
public class TestRestService {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestRestService.class);


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getTestMessageAndLog() {
        LOGGER.info("test");
        return Response.ok("test").build();

    }
}
