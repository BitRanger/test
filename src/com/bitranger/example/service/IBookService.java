package com.bitranger.example.service;

import java.util.List;

import com.bitranger.example.model.Book;


/**
 * wrap dao and difine some of the business logic in the service layer
 * 
 * @author BowenCai
 *
 */
public interface IBookService {

	public List<Book> getAll();
	/**
	 */
	public Book getBook(int bookId);

	/**
	 */
	public void updateBook(Book book);
	
	public List<Book> queryBook();
	
	public void addBook(Book book);
	
	public void delBook(Book book);
}
