package com.example.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@org.springframework.stereotype.Controller
public class Controller {
@RequestMapping(value="/get",method=RequestMethod.GET)
	 public ModelAndView print(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView model=new ModelAndView("get");
		model.addObject("message", "Hello");
		return model;
		 
	 }
	
	
	
	
}
