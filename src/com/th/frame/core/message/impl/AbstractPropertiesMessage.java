/*
 * @(#)AbstractPropertiesMessage.java        Dec 31, 2012
 * 
 * Copyright (c) 2012 TH(ThreeHelp) Software Studio All rights reserved.
 *
 * This software is the confidential and proprietary information of TH(ThreeHelp) Software Studio
 * You shall not disclose such Confidential Information 
 * and shall use it only in accordance with the terms of the license agreement 
 * you entered into with TH(ThreeHelp) Software Studio
 *
 */

package com.th.frame.core.message.impl;

import java.io.IOException;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import com.th.frame.core.message.tmpl.PropertiesTemplate;

/**
 * AbstractPropertiesMessage.java
 * <p>@description:</p>
 * @author css
 * @since Dec 31, 2012 11:49:45 AM created by css
 * @version 1.1 <p>create</p>
 *
 */
public abstract class AbstractPropertiesMessage{

	protected static final Log log = LogFactory
	.getLog(AbstractPropertiesMessage.class);
	
	private PropertiesTemplate propertiesTemplate ;
	
	private static Properties properties ;	
	
	protected String getMessageValue(String key) {
		if (null == key || "".equals(key))
			return "";
		Properties _prop = getDefaultProperties();
		return _prop.containsKey(key) ? _prop.getProperty(key) : "";
	}	
	
	/**
	 * isDebug
	 * @return
	 */
	protected boolean isDebugFlag(){
		if(null==properties) getDefaultProperties();
		if ("false".equals(propertiesTemplate.getIsDebug()))
			return false;
		return true;
	}
	
	/**
	 * get default
	 * @return Properties
	 */
	private Properties getDefaultProperties(){
		if(null==properties) buildDefaultProperties();
		return properties;
	}
	
	/**
	 * build default
	 */
	private void buildDefaultProperties(){
		if(null==propertiesTemplate) return ;
		properties = new Properties();
		log.info("\r\n***********************************************************************");
		log.info("Debug Mode : "+propertiesTemplate.getIsDebug());
		log.info("Loading system reference attributes ... ");
		if ("false".equals(propertiesTemplate.getIsDebug())) {
			for (String propFile : propertiesTemplate.getLiveFiles()) {
				log.info("Loading File : " + propFile);
				try {
					PropertiesLoaderUtils.fillProperties(properties,
							new ClassPathResource(propFile));
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} else {
			for (String propFile : propertiesTemplate.getDebugFiles()) {
				log.info("Loading File : " + propFile);
				try {
					PropertiesLoaderUtils.fillProperties(properties,
							new ClassPathResource(propFile));
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		if(null==properties){
			log.info("Loading system reference attributes : error ");
		}else{
			log.info("Loading system reference attributes : success ");
			if("true".equals(propertiesTemplate.getIsDebug())){
				log.info("***********************************************************************");
				log.info("List system reference attributes ");
				log.info("***********************************************************************");
				for(Object key :properties.keySet()){
					log.info(key+" = "+properties.getProperty((String) key));
				}
			}
		}
		log.info("***********************************************************************\r\n");
		
	}

	public void setPropertiesTemplate(PropertiesTemplate propertiesTemplate) {
		this.propertiesTemplate = propertiesTemplate;
	}
	
	
}
