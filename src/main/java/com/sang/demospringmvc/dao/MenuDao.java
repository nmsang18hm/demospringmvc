package com.sang.demospringmvc.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sang.demospringmvc.entity.MapperMenus;
import com.sang.demospringmvc.entity.Menu;

@Repository
public class MenuDao extends BaseDao {
	
	public List<Menu> getDataMenus() {
		List<Menu> list = new ArrayList<Menu>();
		String sql = "SELECT * FROM menus";
		list = _jdbcTemplate.query(sql, new MapperMenus());
		return list;
	}
}
