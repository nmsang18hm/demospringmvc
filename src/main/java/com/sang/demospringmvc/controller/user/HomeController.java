package com.sang.demospringmvc.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

 
@Controller
public class HomeController extends BaseController{
	
    @RequestMapping(value = {"/", "/trang-chu"})
    public ModelAndView Index() {
    	_mvShare.setViewName("user/index");
    	_mvShare.addObject("slides", _homeService.getDataSlides());
    	_mvShare.addObject("categories", _homeService.getDataCategories());
    	return _mvShare;
    }
    
    @RequestMapping(value = {"/product"})
    public ModelAndView Product() {
    	ModelAndView modelAndView = new ModelAndView("user/product");
    	return modelAndView;
    }
}