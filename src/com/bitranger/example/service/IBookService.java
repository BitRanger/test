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
	
	/**
	 * 函数说明：获得一条的信息 参数说明： ID 返回值：对象
	 */
	public Book getBook(int bookId);

	/**
	 * 函数说明：修改信息 参数说明： 对象 返回值：
	 */
	public void updateBook(Book book);
	
	public List<Book> queryBook();
	
	public void addBook(Book book);
	
	public void delBook(Book book);
}
