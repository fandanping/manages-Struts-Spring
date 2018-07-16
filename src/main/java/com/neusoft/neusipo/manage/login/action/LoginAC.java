package com.neusoft.neusipo.manage.login.action;

import com.neusoft.neusipo.base.action.ManageBaseAction;
import com.neusoft.neusipo.manage.login.bizservice.LoginService;
import com.neusoft.neusipo.manage.login.domain.Person;


/**
 * 
 * <p>[描述信息：说明类的基本功能]</p>
 *
 * @author 范丹平
 * @mail fandp@neusoft.com
 * @version 1.0 Created on 2018-3-2 上午10:50:32
 */
public class LoginAC extends ManageBaseAction {
    private LoginService loginService;
    private String username;
    private String password;
    private String loginstate;
    
    
    public String execute(){
       Person person=loginService.queryUserInfo(username);
       if(person ==null){
    	   return ERROR;
       }else{
    	   if(person.getUsername()!=null && person.getUsername()!=""){
        	   if(person.getPassword().equals(password)){
    				this.loginstate="用户名密码匹配";
    				 return SUCCESS;	
    			}else{
    				this.loginstate="登录失败";
    				 return ERROR;	
    			}
        	   
           }else{
        	   return ERROR;
           }
       }
      
	  		   	
    }
    
    
	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}


	public void setUsername(String username) {
		this.username = username;
	}
    
	

	public String getUsername() {
		return username;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getLoginstate() {
		return loginstate;
	}


	public void setLoginstate(String loginstate) {
		this.loginstate = loginstate;
	}
	
	
      
	
      
}
