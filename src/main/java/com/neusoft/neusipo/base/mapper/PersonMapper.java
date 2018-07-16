package com.neusoft.neusipo.base.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.neusoft.neusipo.manage.login.domain.Person;

public class PersonMapper implements RowMapper<Person>{

	@Override
	public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
		Person p = new Person();
		p.setPassword(rs.getString("passWord"));
		p.setUsername(rs.getString("userName"));
		return p;
	}

}
