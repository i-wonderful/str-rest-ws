package resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloResource {

    @GET
    @Produces("text/plain")
    public String handleGreeting() {
    	return "Hello World Eeee!!!! 123";
    }
    
    @GET
    @Path("/tyty")
    @Produces(MediaType.APPLICATION_JSON)
    public Response handleRes() {
       
    	return  Response.ok(new Ress("He he he Goo000D!")).build();
    }
    
}
