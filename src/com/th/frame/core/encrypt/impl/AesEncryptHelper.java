/*
 * @(#)AesEncryptHelper.java        Dec 31, 2012
 * 
 * Copyright (c) 2012 TH(ThreeHelp) Software Studio All rights reserved.
 *
 * This software is the confidential and proprietary information of TH(ThreeHelp) Software Studio
 * You shall not disclose such Confidential Information 
 * and shall use it only in accordance with the terms of the license agreement 
 * you entered into with TH(ThreeHelp) Software Studio
 *
 */

package com.th.frame.core.encrypt.impl;

import com.th.frame.core.encrypt.EncryptHelper;
import com.th.frame.core.encrypt.support.AesSupport;

/**
 * AesEncryptHelper.java
 * <p>@description:</p>
 * @author css
 * @since Dec 31, 2012 2:01:01 PM created by css
 * @version 1.1 <p>create</p>
 *
 */
public class AesEncryptHelper extends AesSupport implements EncryptHelper{

	@Override
	public String decryptString(String privateKey, String encryptStr) {

		return decrypt(privateKey, encryptStr);
	}

	@Override
	public String encryptString(String privateKey, String protoStr) {

		return encrypt(privateKey, protoStr);
	}
	
	public static void main(String[] args){
		
		AesEncryptHelper test = new AesEncryptHelper();
		System.out.println(test.decryptString("css", "981D8B93904551A6DDBDA53E155F8A60"));
		System.out.println(test.encryptString("css", "css"));
	}

}
