package com.java.rest.service;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.java.rest.dao.EmployDao;
import com.java.rest.dao.EmployDaoImpl;
import com.java.rest.model.Employ;

@Path("/employService")
public class EmployService {

	private static EmployDao employDao;
	
	static {
		employDao = new EmployDaoImpl();
	}
	
	@GET
	@Path("/showEmploy")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employ> showEmployService() throws SQLException {
		return employDao.showEmployDao();
	}
	
	@GET
	@Path("/searchEmploy/{empno}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employ searchEmployService(@PathParam("empno") int empno) throws SQLException {
		return employDao.searchEmployDao(empno);
	}
	
	@POST
	@Path("/addEmploy")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String addEmploy(Employ employ) throws SQLException {
		return employDao.addEmployDao(employ);
	}
}
