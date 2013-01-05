/*
 * @(#)PropertyPlaceholderConfigurerHelper.java        Dec 31, 2012
 * 
 * Copyright (c) 2012 TH(ThreeHelp) Software Studio All rights reserved.
 *
 * This software is the confidential and proprietary information of TH(ThreeHelp) Software Studio
 * You shall not disclose such Confidential Information 
 * and shall use it only in accordance with the terms of the license agreement 
 * you entered into with TH(ThreeHelp) Software Studio
 *
 */

package com.th.frame.extend;

import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

import com.th.frame.core.encrypt.EncryptHelper;
import com.th.frame.core.message.MessageHelper;

/**
 * PropertyPlaceholderConfigurerHelper.java
 * <p>@description:</p>
 * @author css
 * @since Dec 31, 2012 1:37:28 PM created by css
 * @version 1.1 <p>create</p>
 *
 */
public class PropertyPlaceholderConfigurerHelper extends PropertyPlaceholderConfigurer{

	protected static final Log log = LogFactory
	.getLog(PropertyPlaceholderConfigurerHelper.class);
	
	private MessageHelper messageHelper ;

	private EncryptHelper encryptHelper ;
	
	@Override
	protected void processProperties(
			ConfigurableListableBeanFactory beanFactoryToProcess,
			Properties props) throws BeansException {

        String protoPassword = props.getProperty("jdbc.password");
		if(messageHelper.isDebug()){
			log.info("***********************************************************************");
			log.info("decrypt password :"+protoPassword);
		}
		protoPassword =  encryptHelper.decryptString(messageHelper.getGlobalKey(),protoPassword);
		if(messageHelper.isDebug()){
			log.info("decrypt result :"+protoPassword);
			log.info("***********************************************************************\r\n");
		}
		props.setProperty("jdbc.password", protoPassword);
		super.processProperties(beanFactoryToProcess, props);
	}


	public void setMessageHelper(MessageHelper messageHelper) {
		this.messageHelper = messageHelper;
	}


	public void setEncryptHelper(EncryptHelper encryptHelper) {
		this.encryptHelper = encryptHelper;
	}
	
	
	
}
