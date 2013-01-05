/*
 * @(#)GlobalAction.java        Dec 31, 2012
 * 
 * Copyright (c) 2012 TH(ThreeHelp) Software Studio All rights reserved.
 *
 * This software is the confidential and proprietary information of TH(ThreeHelp) Software Studio
 * You shall not disclose such Confidential Information 
 * and shall use it only in accordance with the terms of the license agreement 
 * you entered into with TH(ThreeHelp) Software Studio
 *
 */

package com.th.frame.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.opensymphony.xwork2.ActionSupport;
import com.th.frame.core.encrypt.EncryptHelper;
import com.th.frame.core.message.MessageHelper;


/**
 * GlobalAction.java
 * <p>@description:</p>
 * @author css
 * @since Dec 31, 2012 11:27:41 AM created by css
 * @version 1.1 <p>create</p>
 *
 */
@SuppressWarnings("serial")
public abstract class GlobalAction extends ActionSupport{

	protected HttpServletRequest request;
	protected HttpServletResponse response;
	@SuppressWarnings("rawtypes")
	protected Map session;
	
	protected MessageHelper messageHelper ;
	protected EncryptHelper encryptHelper ;
	
	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}
	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}
	@SuppressWarnings("rawtypes")
	public void setSession(Map session) {
		this.session = session;
	}
	public void setMessageHelper(MessageHelper messageHelper) {
		this.messageHelper = messageHelper;
	}
	public void setEncryptHelper(EncryptHelper encryptHelper) {
		this.encryptHelper = encryptHelper;
	}
	

	
}
