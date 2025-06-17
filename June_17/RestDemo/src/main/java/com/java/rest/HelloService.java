package com.java.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloService {

	  @GET 
	  @Path("/greeting")
	  @Produces(MediaType.TEXT_PLAIN)  
	  public String sayHello() {
		return "Welcome to RestFul Services...";
	  }
	  
	  @GET
	  @Path("/show/{name}")
	  @Produces(MediaType.TEXT_PLAIN)
	  public String showInfo(@PathParam("name") String name) {
		  return "Hi My Name is " +name;
	  }
}
