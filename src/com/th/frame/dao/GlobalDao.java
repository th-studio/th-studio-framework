/*
 * @(#)GlobalDao.java        Dec 31, 2012
 * 
 * Copyright (c) 2012 TH(ThreeHelp) Software Studio All rights reserved.
 *
 * This software is the confidential and proprietary information of TH(ThreeHelp) Software Studio
 * You shall not disclose such Confidential Information 
 * and shall use it only in accordance with the terms of the license agreement 
 * you entered into with TH(ThreeHelp) Software Studio
 *
 */

package com.th.frame.dao;

import java.io.Serializable;
import java.util.List;

/**
 * GlobalDao.java
 * <p>@description:</p>
 * @author css
 * @since Dec 31, 2012 11:29:59 AM created by css
 * @version 1.1 <p>create</p>
 *
 */
@SuppressWarnings("rawtypes")
public interface GlobalDao <T, PK extends Serializable>{

	/**
	 * 获取主键为id的entityClass对象
	 * 
	 * @param entityClass
	 * @param id
	 * @return
	 */
	public Object get(Class entityClass, Serializable id);
	/**
	 * 把数据加载到指定的非持久化实例上
	 * 
	 * @param entityObject
	 * @param id
	 */
	public void load(T entityObject, PK id);
	/**
	 * 删除对象.
	 */
	public void delete(Object entityObject);
	/**
	 * 保存对象.<br>
	 * 
	 * @param entityObject
	 */
	public void save(Object entityObject);

	/**
	 * 保存对象.<br>
	 * 
	 * @param entityObject
	 */
	public void saveOrUpdate(Object entityObject);
	/**
	 * 根据hql查询,直接使用HibernateTemplate的find函数.
	 * @param <T>
	 * @param hql
	 * @param values
	 * @return
	 */
	public List<T> find(String hql, Object... values);
	
}
