package com.zosh.response;

import com.zosh.modal.User;
import com.zosh.user.domain.UserRole;

public class AuthResponse {

	private String jwt;

	private boolean status;

	private User user;
	private String userRole;

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public AuthResponse() {
		// TODO Auto-generated constructor stub
	}

	public AuthResponse(String jwt, boolean status , String userRole) {
		super();
		this.jwt = jwt;
		this.status = status;
		this.userRole=userRole;
	}

	public String getJwt() {
		return jwt;
	}

	public void setJwt(String jwt) {
		this.jwt = jwt;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}



}
