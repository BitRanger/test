package com.bitranger.example.test.dao;

import static org.junit.Assert.*;

import org.hibernate.mapping.Table;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bitranger.example.dao.IDAOTag;
import com.bitranger.example.model.PSTag;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class TestDAOTag {

	@Autowired
	IDAOTag tagDao;
	
//	@Before
	public void setUp() throws Exception {
		PSTag tag = new PSTag();
		tag.setName("test tag1");
		tagDao.save(tag);
		tag.setName("test tag2");
		tagDao.save(tag);
	}

	@Test
	public void test() {
		System.err.println(tagDao.getAll());
	}

	@After
	public void tearDown() throws Exception {
	}

	public IDAOTag getTagDao() {
		return tagDao;
	}

	public void setTagDao(IDAOTag tagDao) {
		this.tagDao = tagDao;
	}

}
