package com.daniel.model;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

public class JwtAuthenticationToken extends UsernamePasswordAuthenticationToken{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String token;
	
	public JwtAuthenticationToken(String token) {
		super(null, null);
		// TODO Auto-generated constructor stub
		this.token = token;
	}
	
	

	@Override
	public Object getCredentials() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Object getPrincipal() {
		// TODO Auto-generated method stub
		return null;
	}



	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	

}
