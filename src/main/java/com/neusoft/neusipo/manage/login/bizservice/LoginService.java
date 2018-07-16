package com.neusoft.neusipo.manage.login.bizservice;

import com.neusoft.neusipo.manage.login.domain.Person;



/**
 * 
 * <p>[描述信息：说明类的基本功能]</p>
 *
 * @author 范丹平
 * @mail fandp@neusoft.com
 * @version 1.0 Created on 2018-3-2 上午10:45:21
 */
public interface LoginService {
	
	public abstract Person queryUserInfo(String param);
	
}
