package com.sang.demospringmvc.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sang.demospringmvc.entity.MapperSlide;
import com.sang.demospringmvc.entity.Slide;

@Repository
public class HomeDao {
	@Autowired
	public JdbcTemplate jdbcTemplate;
	
	public List<Slide> getDataSlide() {
		List<Slide> list = new ArrayList<Slide>();
		String sql = "SELECT * FROM slides";
		list = jdbcTemplate.query(sql, new MapperSlide());
		return list;
	}
}
