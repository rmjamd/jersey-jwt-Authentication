package com.ramij.JwtAuthentication;

import java.security.Key;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

public class JwTokenHelper {

	 private static JwTokenHelper jwTokenHelper = null;
	   private static final long EXPIRATION_LIMIT = 30;
	   private Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);
	   private JwTokenHelper() {
	   }
	   public static JwTokenHelper getInstance() {
	      if(jwTokenHelper == null)
	           jwTokenHelper = new JwTokenHelper();
	      return jwTokenHelper;
	   }
	   //  1
	   public String generatePrivateKey(String username, String password) {
	       return Jwts
	                .builder()
	                .setSubject(username)
	                .setSubject(password)
	                .setExpiration(getExpirationDate())
	                .signWith(key)
	                .compact();
	   }
	   
	   public void claimKey(String privateKey) throws ExpiredJwtException, MalformedJwtException  {
	      Jwts
	                .parser()
	                .setSigningKey(key)
	                .parseClaimsJws(privateKey);
	   }

	 
	   private Date getExpirationDate() {
	       long currentTimeInMillis = System.currentTimeMillis();
	       long expMilliSeconds = TimeUnit.MINUTES.toMillis(EXPIRATION_LIMIT);
	       return new Date(currentTimeInMillis + expMilliSeconds);
	   }

	}