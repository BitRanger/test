package com.bitranger.example.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.bitranger.example.dao.IDAOTag;
import com.bitranger.example.model.PSTag;

public class DAOTag extends HibernateDaoSupport implements IDAOTag{

	@SuppressWarnings("unchecked")
	@Override
	public List<PSTag> getAll() {
		return getHibernateTemplate().find("from PSTag");
	}

	@Override
	public int	save(PSTag tag) {
		return (Integer)(getHibernateTemplate().save(tag));
	}
}
