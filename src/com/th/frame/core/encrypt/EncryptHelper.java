/*
 * @(#)EncryptHelper.java        Dec 31, 2012
 * 
 * Copyright (c) 2012 TH(ThreeHelp) Software Studio All rights reserved.
 *
 * This software is the confidential and proprietary information of TH(ThreeHelp) Software Studio
 * You shall not disclose such Confidential Information 
 * and shall use it only in accordance with the terms of the license agreement 
 * you entered into with TH(ThreeHelp) Software Studio
 *
 */

package com.th.frame.core.encrypt;

/**
 * EncryptHelper.java
 * <p>@description:</p>
 * @author css
 * @since Dec 31, 2012 1:54:37 PM created by css
 * @version 1.1 <p>create</p>
 *
 */
public interface EncryptHelper {

	/**
	 * 加密
	 * @param privateKey 私钥
	 * @param protoStr 原型字符串
	 * @since 1.1
	 * @return
	 */
	String encryptString(String privateKey,String protoStr);
	/**
	 * 解密
	 * @param privateKey 私钥
	 * @param encryptStr 加密字符串
	 * @since 1.1 
	 * @return
	 */
	String decryptString(String privateKey,String encryptStr);
	
}
