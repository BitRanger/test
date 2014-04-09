package com.bitranger.example.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.bitranger.example.dao.IDAOBook;
import com.bitranger.example.model.Book;
import com.bitranger.example.service.IBookService;

public class BookService implements IBookService{


	@Override
	public List<Book> getAll() {
		return bookDao.getAll();
	}
	/**
	 * this property will be injected(set) by the spring IoC container automatically
	 */
	@Inject private IDAOBook bookDao;

	@Override
	public Book getBook(int bookId) {
		return bookDao.getById(bookId);
	}

	@Override
	public void updateBook(Book book) {
		bookDao.update(book);
	}

	
	@Override
	public List<Book> queryBook() {
		return bookDao.getAll();
	}
	
	@Override
	public void addBook(Book book) {
		bookDao.save(book);
	}
	
	@Override
	public void delBook(Book book) {
		bookDao.delete(book);
	}

	public IDAOBook getBookDao() {
		return bookDao;
	}

	public void setBookDao(IDAOBook bookDao) {
		this.bookDao = bookDao;
	}
}
