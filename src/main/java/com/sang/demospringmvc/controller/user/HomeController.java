package com.sang.demospringmvc.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sang.demospringmvc.dao.HomeDao;
 
@Controller
public class HomeController {
	@Autowired
	HomeDao homeDao;

    @RequestMapping(value = {"/", "/trang-chu"})
    public ModelAndView Index() {
    	ModelAndView modelAndView = new ModelAndView("user/index");
    	modelAndView.addObject("slides", homeDao.getDataSlide());
    	return modelAndView;
    }
    
    @RequestMapping(value = {"/product"})
    public ModelAndView Product() {
    	ModelAndView modelAndView = new ModelAndView("user/product");
    	return modelAndView;
    }
}