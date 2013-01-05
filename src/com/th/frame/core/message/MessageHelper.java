/*
 * @(#)MessageHelper.java        Dec 31, 2012
 * 
 * Copyright (c) 2012 TH(ThreeHelp) Software Studio All rights reserved.
 *
 * This software is the confidential and proprietary information of TH(ThreeHelp) Software Studio
 * You shall not disclose such Confidential Information 
 * and shall use it only in accordance with the terms of the license agreement 
 * you entered into with TH(ThreeHelp) Software Studio
 *
 */

package com.th.frame.core.message;

/**
 * MessageHelper.java
 * <p>@description:</p>
 * @author css
 * @since Dec 31, 2012 1:56:08 PM created by css
 * @version 1.1 <p>create</p>
 *
 */
public interface MessageHelper {

	/**
	 * getMessage
	 * @param key
	 * @return
	 */
	String getMessage(String key);
	/**
	 * isDebug
	 * @return
	 */
	boolean isDebug();
	/**
	 * getGlobalKey
	 * @return
	 */
	String getGlobalKey();
	
}
