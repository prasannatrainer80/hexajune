package com.java.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("calc")
public class CalculationService {

	@GET
	@Path("/sum/{x}/{y}")
	@Produces(MediaType.TEXT_PLAIN)
	public String sum(@PathParam("x") int x, @PathParam("y") int y) {
		int z = x + y;
		String res="";
		res+=z;
		return res;
	}
	
	@GET
	@Path("/sub/{x}/{y}")
	@Produces(MediaType.TEXT_PLAIN)
	public String sub(@PathParam("x") int x, @PathParam("y") int y) {
		int z = x - y;
		String res="";
		res+=z;
		return res;
	}
	
	@GET
	@Path("/mult/{x}/{y}")
	public String mult(@PathParam("x") int x, @PathParam("y") int y) {
		int z = x * y;
		String res="";
		res+=z;
		return res;
	}
}
