package com.neusoft.neusipo.manage.login.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.neusoft.neusipo.base.db.JdbcBaseDao;
import com.neusoft.neusipo.manage.login.dao.LoginDAO;
import com.neusoft.neusipo.manage.login.domain.Person;

/**
 * 
 * <p>[描述信息：说明类的基本功能]</p>
 *
 * @author 范丹平
 * @mail fandp@neusoft.com
 * @version 1.0 Created on 2018-3-2 上午10:45:32
 */
public class LoginDAOImpl extends JdbcBaseDao<Person> implements LoginDAO {
	
	
	@Override
	public Person queryUserInfo(String param) {
		  
		 String sql="select userName , password from user where username = '"+param+"'";
		 Person per=new Person();
		 //per = this.getJdbcTemplate().query(sql,new PersonMapper()).get(0);
		 per = this.queryDomain(sql, new PersonMapper());
 
		 return per;
	    
	}
	
	
	/**
	 * login查询用户信息的mapper
	 */
	private class PersonMapper implements RowMapper<Person>{

		@Override
		public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
			Person p = new Person();
			p.setPassword(rs.getString("passWord"));
			p.setUsername(rs.getString("userName"));
			return p;
		}

	}

}
