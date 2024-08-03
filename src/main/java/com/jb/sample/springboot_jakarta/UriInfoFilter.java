package com.jb.sample.springboot_jakarta;

import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerRequestFilter;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.UriInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UriInfoFilter implements ContainerRequestFilter {

    @Autowired
    private UriInfoHolder uriInfoHolder;

    @Context
    private UriInfo uriInfo;

    @Override
    public void filter(ContainerRequestContext requestContext) {
        uriInfoHolder.setUriInfo(uriInfo);
    }
}
