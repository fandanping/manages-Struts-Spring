package com.neusoft.neusipo.manage.login.domain;

import com.neusoft.neusipo.base.domain.BaseDomain;

public class Person extends BaseDomain {
  
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
		
}
