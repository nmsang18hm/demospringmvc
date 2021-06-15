package com.sang.demospringmvc.service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sang.demospringmvc.dto.ProductsDto;
import com.sang.demospringmvc.entity.Category;
import com.sang.demospringmvc.entity.Menu;
import com.sang.demospringmvc.entity.Slide;

@Service
public interface IHomeService {
	@Autowired
	public List<Slide> getDataSlides();
	@Autowired
	public List<Category> getDataCategories();
	@Autowired
	public List<Menu> getDataMenus();
	@Autowired
	public List<ProductsDto> getDataProducts();
}
