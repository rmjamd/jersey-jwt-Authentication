package com.ramij.JwtAuthentication;


import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;


@ApplicationPath("/")
public class Appconfig extends ResourceConfig {

	public Appconfig()
	{
		packages("com.ramij.JwtAuthentication");
//		register(MyResource.class);

	}
}
