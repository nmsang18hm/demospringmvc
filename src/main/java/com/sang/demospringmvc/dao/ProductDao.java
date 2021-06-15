package com.sang.demospringmvc.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sang.demospringmvc.dto.MapperProductsDto;
import com.sang.demospringmvc.dto.ProductsDto;

@Repository
public class ProductDao extends BaseDao {
	
	public List<ProductsDto> getDataProducts() {
		List<ProductsDto> list = new ArrayList<ProductsDto>();
		String sql = "SELECT "
				+ "p.id AS id_product, p.id_category, p.size, p.name, p.price, p.sale, p.title, p.highlight, p.new_product, p.detail, "
				+ "c.id AS id_color, c.name AS name_color, c.code AS code_color, c.img, p.created_at, p.updated_at "
				+ "FROM products AS p INNER JOIN colors AS c ON p.id = c.id_product GROUP BY p.id, c.id_product";
		list = _jdbcTemplate.query(sql, new MapperProductsDto());
		return list;
	}
}
