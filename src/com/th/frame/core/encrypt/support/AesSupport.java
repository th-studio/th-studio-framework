/*
 * @(#)AesSupport.java        Dec 31, 2012
 * 
 * Copyright (c) 2012 TH(ThreeHelp) Software Studio All rights reserved.
 *
 * This software is the confidential and proprietary information of TH(ThreeHelp) Software Studio
 * You shall not disclose such Confidential Information 
 * and shall use it only in accordance with the terms of the license agreement 
 * you entered into with TH(ThreeHelp) Software Studio
 *
 */

package com.th.frame.core.encrypt.support;

import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/**
 * AesSupport.java
 * <p>@description:</p>
 * @author css
 * @since Dec 31, 2012 2:00:10 PM created by css
 * @version 1.1 <p>create</p>
 *
 */
public abstract class AesSupport {

	private static byte[] encrypt(byte[] content, byte[] privateKey) throws Exception {
		
		//AES加密算法
		KeyGenerator kgen = KeyGenerator.getInstance("AES");
		//防止linux下 随机生成key  
        SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG" );     
        secureRandom.setSeed(privateKey);
		kgen.init(128, secureRandom);
		SecretKey secretKey = kgen.generateKey();   
        byte[] enCodeFormat = secretKey.getEncoded();   
        SecretKeySpec secretKeySpec = new SecretKeySpec(enCodeFormat, "AES");   		

        Cipher cipher = Cipher.getInstance("AES");// 创建密码器   
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);// 初始化
        
        byte[] result = cipher.doFinal(content);   
        return result; // 加密

	}

	private static byte[] decrypt(byte[] content, byte[] privateKey) throws Exception {
		
		//AES解密算法
        KeyGenerator kgen = KeyGenerator.getInstance("AES");   
		//防止linux下 随机生成key  
        SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG" );     
        secureRandom.setSeed(privateKey);
		kgen.init(128, secureRandom);   
        SecretKey secretKey = kgen.generateKey();   
        byte[] enCodeFormat = secretKey.getEncoded();   
        SecretKeySpec key = new SecretKeySpec(enCodeFormat, "AES");               
        Cipher cipher = Cipher.getInstance("AES");// 创建密码器   
        cipher.init(Cipher.DECRYPT_MODE, key);// 初始化   
        byte[] result = cipher.doFinal(content);   
        return result; //解密		
	}
	
	private static String byte2hex(byte[] b) {
		String hs = "";
		String stmp = "";
		for (int n = 0; n < b.length; n++) {
			stmp = (java.lang.Integer.toHexString(b[n] & 0XFF));
			if (stmp.length() == 1)
				hs = hs + "0" + stmp;
			else
				hs = hs + stmp;
		}
		return hs.toUpperCase();
	}

	private static byte[] hex2byte(byte[] b) {
		if ((b.length % 2) != 0)
			throw new IllegalArgumentException("Length is not even");
		byte[] b2 = new byte[b.length / 2];
		for (int n = 0; n < b.length; n += 2) {
			String item = new String(b, n, 2);
			b2[n / 2] = (byte) Integer.parseInt(item, 16);
		}
		return b2;
	}	

	/**
	 * 解密
	 * @param privateKey 私钥
	 * @param content 加密串
	 * @return
	 */
	protected final static String decrypt(String privateKey,String content) {
		try {
			return new String(decrypt(hex2byte(content.getBytes()),privateKey.getBytes()),"UTF-8");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}	
	
	/**
	 * 加密
	 * @param privateKey 私钥
	 * @param content 原型字符串
	 * @return
	 */
	protected final static String encrypt(String privateKey,String content) {

		try {
			return byte2hex(encrypt(content.getBytes("UTF-8"), privateKey.getBytes()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}
	
}
