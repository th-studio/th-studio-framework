/*
 * @(#)GlobalDaoImpl.java        Dec 31, 2012
 * 
 * Copyright (c) 2012 TH(ThreeHelp) Software Studio All rights reserved.
 *
 * This software is the confidential and proprietary information of TH(ThreeHelp) Software Studio
 * You shall not disclose such Confidential Information 
 * and shall use it only in accordance with the terms of the license agreement 
 * you entered into with TH(ThreeHelp) Software Studio
 *
 */

package com.th.frame.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.th.frame.dao.GlobalDao;

/**
 * GlobalDaoImpl.java
 * <p>@description:</p>
 * @author css
 * @since Dec 31, 2012 11:31:07 AM created by css
 * @version 1.1 <p>create</p>
 *
 */
@SuppressWarnings("unchecked")
public class GlobalDaoImpl<T, PK extends Serializable> extends HibernateDaoSupport implements GlobalDao<T, PK>{

	public void delete(Object entityObject) {
		this.getHibernateTemplate().delete(entityObject);
	}

	public List<T> find(String hql, Object... values) {
		return this.getHibernateTemplate().find(hql, values);
	}

	@SuppressWarnings("rawtypes")
	public Object get(Class entityClass, Serializable id) {
		return this.getHibernateTemplate().get(entityClass, id);
	}

	public void load(T entityObject, PK id) {
		this.getHibernateTemplate().load(entityObject, id);
	}

	public void save(Object entityObject) {
		this.getHibernateTemplate().save(entityObject);
	}

	public void saveOrUpdate(Object entityObject) {
		this.getHibernateTemplate().saveOrUpdate(entityObject);
	}

}
