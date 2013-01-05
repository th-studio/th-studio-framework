/*
 * @(#)PropertiesTemplate.java        Dec 31, 2012
 * 
 * Copyright (c) 2012 TH(ThreeHelp) Software Studio All rights reserved.
 *
 * This software is the confidential and proprietary information of TH(ThreeHelp) Software Studio
 * You shall not disclose such Confidential Information 
 * and shall use it only in accordance with the terms of the license agreement 
 * you entered into with TH(ThreeHelp) Software Studio
 *
 */

package com.th.frame.core.message.tmpl;

import java.util.List;

/**
 * PropertiesTemplate.java
 * <p>@description:</p>
 * @author css
 * @since Dec 31, 2012 11:47:22 AM created by css
 * @version 1.1 <p>create</p>
 *
 */
public class PropertiesTemplate {

	/**
	 * 通过该标志判断当前模式是正式环境还是测试环境 从而判断加载那个属性文件
	 * @since 1.1 
	 */
	private String isDebug;
	/**
	 * 保存测试环境属性文件列表
	 * @since 1.1 
	 */	
	private List<String> debugFiles ;
	
	/**
	 * 保存正式环境属性文件列表
	 * @since 1.1 
	 */	
	private List<String> liveFiles ;

	public String getIsDebug() {
		return isDebug;
	}

	public void setIsDebug(String isDebug) {
		this.isDebug = isDebug;
	}

	public List<String> getDebugFiles() {
		return debugFiles;
	}

	public void setDebugFiles(List<String> debugFiles) {
		this.debugFiles = debugFiles;
	}

	public List<String> getLiveFiles() {
		return liveFiles;
	}

	public void setLiveFiles(List<String> liveFiles) {
		this.liveFiles = liveFiles;
	}
	
}
