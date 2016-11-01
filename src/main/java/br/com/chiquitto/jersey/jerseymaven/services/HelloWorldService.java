package br.com.chiquitto.jersey.jerseymaven.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/helloworld")
public class HelloWorldService {
    
    @GET
    public String oi() {
        return "Hello World";
    }
}
