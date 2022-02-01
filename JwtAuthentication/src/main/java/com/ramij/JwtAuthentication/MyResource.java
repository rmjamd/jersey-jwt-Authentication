package com.ramij.JwtAuthentication;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("/getdata")
public class MyResource {

    
	@GET
	@Path("/secure")
	@Produces(MediaType.APPLICATION_JSON)
	public String getsecureData()
	{
		return "hi Ramij";
	}
	@GET
	@Path("/insecure")
	@Produces(MediaType.APPLICATION_JSON)
	public String getData()
	{
		return "hi Ramij";
	}
	
}
