package com.neusoft.neusipo.base.db;

import java.util.List;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import com.neusoft.neusipo.base.domain.BaseDomain;


/**
 * 
 * <p>[描述信息：说明类的基本功能]</p>
 *
 * @author 范丹平
 * @mail fandp@neusoft.com
 * @version 1.0 Created on 2018-3-2 下午05:29:23
 */
public class JdbcBaseDao<T extends BaseDomain> extends NamedParameterJdbcDaoSupport {
  
	protected T queryDomain(String sql, RowMapper<T> rowMapper){
		List<T> objList = this.getJdbcTemplate().query(sql, rowMapper);
		if(objList.size() == 0){
			return null;
		}
		return objList.get(0);
	}
	
	
	
	protected Object queryObject(String sql, RowMapper rowMapper){
		List objList = this.getJdbcTemplate().query(sql, rowMapper);
		if(objList.size() == 0){
			return null;
		}
		return objList.get(0);
	}
}
