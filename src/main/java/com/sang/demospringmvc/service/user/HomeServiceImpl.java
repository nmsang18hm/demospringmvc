package com.sang.demospringmvc.service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sang.demospringmvc.dao.CategoryDao;
import com.sang.demospringmvc.dao.MenuDao;
import com.sang.demospringmvc.dao.SlideDao;
import com.sang.demospringmvc.entity.Category;
import com.sang.demospringmvc.entity.Menu;
import com.sang.demospringmvc.entity.Slide;

@Service
public class HomeServiceImpl implements IHomeService {
	@Autowired
	private SlideDao slideDao;
	@Autowired
	private CategoryDao categoryDao;
	@Autowired
	private MenuDao menuDao;

	@Override
	public List<Slide> getDataSlides() {
		return slideDao.getDataSlides();
	}

	public List<Category> getDataCategories() {
		return categoryDao.getDataCategories();
	}
	public List<Menu> getDataMenus() {
		return menuDao.getDataMenus();
	}
}
