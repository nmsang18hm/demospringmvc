package com.sang.demospringmvc.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sang.demospringmvc.entity.MapperSlides;
import com.sang.demospringmvc.entity.Slide;

@Repository
public class SlideDao extends BaseDao {
	
	public List<Slide> getDataSlides() {
		List<Slide> list = new ArrayList<Slide>();
		String sql = "SELECT * FROM slides";
		list = _jdbcTemplate.query(sql, new MapperSlides());
		return list;
	}
}
