package com.ramij.JwtAuthentication;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.ext.Provider;

@Provider
public class AuthenticationFilter implements ContainerRequestFilter {
 
	private JwTokenHelper jwTokenHelper = JwTokenHelper.getInstance();
	@Override
	public void filter(ContainerRequestContext requestContext) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * if(requestContext.getUriInfo().getPath().equals("gettoken")) { return ; }
		 * String token=requestContext.getHeaderString("authorization");
		 * 
		 * jwTokenHelper.claimKey(token); // 7 //
		 * 
		 */}
}