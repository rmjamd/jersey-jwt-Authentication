package com.ramij.JwtAuthentication;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/gettoken")
public class Login {
	
		
	@POST
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String getToken(User user) 
	{
		JwTokenHelper jHelper=JwTokenHelper.getInstance();
		String password=user.getPassword();
		String username=user.getUsername();
		String key=jHelper.generatePrivateKey(username, password);
	//	jHelper.claimKey(key);
    			return key;
    }
}
