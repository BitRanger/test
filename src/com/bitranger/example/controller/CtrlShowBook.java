package com.bitranger.example.controller;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

public class CtrlShowBook {

	@RequestMapping(value="/index", method=RequestMethod.GET)
	public ModelAndView index() {
	 	ModelAndView mv = new ModelAndView("test-view");
	 	mv.addObject("msg", "I am using Spring MVC, hahahaha!");
		return mv;
	}
}
