package com.sang.demospringmvc.service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sang.demospringmvc.entity.Slide;

@Service
public interface IHomeService {
	@Autowired
	public List<Slide> getDataSlide();
}
