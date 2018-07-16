package com.neusoft.neusipo.manage.login.bizservice.impl;

import com.neusoft.neusipo.manage.login.bizservice.LoginService;
import com.neusoft.neusipo.manage.login.dao.LoginDAO;
import com.neusoft.neusipo.manage.login.domain.Person;
/**
 * 
 * <p>[描述信息：说明类的基本功能]</p>
 *
 * @author 范丹平
 * @mail fandp@neusoft.com
 * @version 1.0 Created on 2018-3-2 上午10:47:15
 */
public class LoginServiceImpl implements LoginService {
	
	private LoginDAO loginDAO;
	
	public void setLoginDAO(LoginDAO loginDAO) {
		this.loginDAO = loginDAO;
	}



	@Override
	public Person queryUserInfo(String param) {
		// TODO Auto-generated method stub
		return loginDAO.queryUserInfo(param);
	}

}
