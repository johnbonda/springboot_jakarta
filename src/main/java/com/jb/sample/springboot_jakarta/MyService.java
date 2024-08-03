package com.jb.sample.springboot_jakarta;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class MyService {

    @Autowired
    UriInfoHolder uriInfoHolder;

    public void myMethod() {
        System.out.println("In my method");
        System.out.println("method uriinfo: "+ uriInfoHolder.getUriInfo().getPath());
    }
}
