package com.bitranger.example.test.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bitranger.example.dao.impl.DAOBook;
import com.bitranger.example.model.Book;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class Test_DAOBook {

	/**
	 * WARNING: Autowired property must have the 
	 * exactly the SAME name as its bean ID specified in applicationContext.xml
	 * Test it
	 */
	@Autowired
	DAOBook bookDao;
	
	@Before
	public void setUp() throws Exception {
		assertNotNull(bookDao);
		Book newBook = new Book();
		newBook.setName("junit book");
		newBook.setDetail("new book created in Junit");
		bookDao.save(newBook);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		List<Book> books = bookDao.getAll();
		System.err.println("ALl Books");
		for (Book book : books) {
			System.err.println(book.getId() + "   " + book.getName() + "  " + book.getDetail());
		}
	}
}
