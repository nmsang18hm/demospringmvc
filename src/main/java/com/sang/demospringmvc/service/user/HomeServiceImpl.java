package com.sang.demospringmvc.service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sang.demospringmvc.dao.SlideDao;
import com.sang.demospringmvc.entity.Slide;

@Service
public class HomeServiceImpl implements IHomeService {
	@Autowired
	private SlideDao slideDao;

	@Override
	public List<Slide> getDataSlide() {
		return slideDao.getDataSlide();
	}

}
