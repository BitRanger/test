package com.bitranger.example.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.bitranger.example.dao.IDAOBook;
import com.bitranger.example.model.Book;


/**
 * Implementation of
 * Data Access Object for model.Book
 * 
 * @see impl.DAOBook
 * @author BowenCai
 *
 */
public class DAOBook extends HibernateDaoSupport implements IDAOBook {

	@Override
	public Book getById(int id) {
		return getHibernateTemplate().get(Book.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Book> getAll() {
		return getHibernateTemplate().find("from ds_book");
	}

	@Override
	public int save(Book book) {
		return (Integer) getHibernateTemplate().save(book);
	}

	@Override
	public void update(Book book) {
		getHibernateTemplate().update(book);
	}

	@Override
	public void delete(Book book) {
		getHibernateTemplate().delete(book);
	}

	@Override
	public void delete(List<Book> bookList) {
		getHibernateTemplate().deleteAll(bookList);
	}
}
