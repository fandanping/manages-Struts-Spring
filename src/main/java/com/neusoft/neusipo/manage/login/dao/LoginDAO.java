package com.neusoft.neusipo.manage.login.dao;

import com.neusoft.neusipo.manage.login.domain.Person;



public interface LoginDAO {
	
	  public Person queryUserInfo(String param);
}
