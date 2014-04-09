package com.bitranger.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bitranger.example.model.Book;
import com.bitranger.example.service.IBookService;

@Controller
public class CtrlShowBook {

	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView index() {
		// map jsp by ModelAndView name: 'index' -> 'index.jsp'
	 	ModelAndView mv = new ModelAndView("index");
	 	mv.addObject("msg", "Mapping by model name, hahahaha!");
	 	List<Book> books = bookService.getAll();
	 	mv.addObject("book-list", books);
		return mv;
	}
	
	@RequestMapping(value="/page-1", method=RequestMethod.GET)
	public ModelAndView page1(ModelAndView mv) {
	 	mv.addObject("msg", "mapping by returing string, hahahaha!");
	 	mv.addObject("book-list", bookService.getAll());
	 // set jsp explicitly
	 	mv.setViewName("index");
		return mv;
	}
	
	/**
	 * using interface, not class!
	 */
	@Autowired
	private IBookService bookService;

	public IBookService getBookService() {
		return bookService;
	}

	public void setBookService(IBookService bookService) {
		this.bookService = bookService;
	}

	
}
