/*
 * @(#)GlobalServiceImpl.java        Dec 31, 2012
 * 
 * Copyright (c) 2012 TH(ThreeHelp) Software Studio All rights reserved.
 *
 * This software is the confidential and proprietary information of TH(ThreeHelp) Software Studio
 * You shall not disclose such Confidential Information 
 * and shall use it only in accordance with the terms of the license agreement 
 * you entered into with TH(ThreeHelp) Software Studio
 *
 */

package com.th.frame.service.impl;

import com.th.frame.core.encrypt.EncryptHelper;
import com.th.frame.core.message.MessageHelper;
import com.th.frame.service.GlobalService;

/**
 * GlobalServiceImpl.java
 * <p>@description:</p>
 * @author css
 * @since Dec 31, 2012 11:32:24 AM created by css
 * @version 1.1 <p>create</p>
 *
 */
public abstract class GlobalServiceImpl implements GlobalService{

	protected MessageHelper messageHelper ;
	protected EncryptHelper encryptHelper ;
	
	public void setMessageHelper(MessageHelper messageHelper) {
		this.messageHelper = messageHelper;
	}
	public void setEncryptHelper(EncryptHelper encryptHelper) {
		this.encryptHelper = encryptHelper;
	}
	
}
