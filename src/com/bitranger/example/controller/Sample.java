package com.bitranger.example.controller;

import java.util.List;

import javax.sound.midi.SysexMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bitranger.example.model.Book;
import com.bitranger.example.service.IBookService;

@Controller
public class Sample {

	String boss = "I am the BOSS!!";
	
	
	@RequestMapping(value="/gaojin", method=RequestMethod.GET)
	public ModelAndView index() {
		// map jsp by ModelAndView name: 'index' -> 'index.jsp'
	 	ModelAndView mv = new ModelAndView("index");
	 	mv.addObject("msg", boss);
	 	List<Book> books = bookService.getAll();
	 	mv.addObject("book-list", books);
		return mv;
	}
	
	@Autowired
	IBookService bookService;
	public IBookService getBookService() {
		return bookService;
	}

	public void setBookService(IBookService bookService) {
		this.bookService = bookService;
	}
	
	
	
}
