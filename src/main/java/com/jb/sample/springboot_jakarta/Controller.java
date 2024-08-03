package com.jb.sample.springboot_jakarta;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.*;
import org.springframework.beans.factory.annotation.Autowired;

@Path("/example")
public class Controller {

    @Context
    private HttpHeaders httpHeaders;

    @Context
    private Request request;

    @Autowired
    private MyService myService;

    @GET
    public Response get(@Context UriInfo uriInfo) {
        String userAgent = httpHeaders.getHeaderString(HttpHeaders.USER_AGENT);
        System.out.println("uri info is:"+ uriInfo.getAbsolutePath().toString());
        myService.myMethod();
        return Response.ok("User-Agent: " + userAgent).build();
    }
}
