package com.sang.demospringmvc.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sang.demospringmvc.entity.Category;
import com.sang.demospringmvc.entity.MapperCategories;


@Repository
public class CategoryDao extends BaseDao {
	
	public List<Category> getDataCategories() {
		List<Category> list = new ArrayList<Category>();
		String sql = "SELECT * FROM categories";
		list = _jdbcTemplate.query(sql, new MapperCategories());
		return list;
	}
}
