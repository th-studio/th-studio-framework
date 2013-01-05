/*
 * @(#)DateHelper.java        Dec 31, 2012
 * 
 * Copyright (c) 2012 TH(ThreeHelp) Software Studio All rights reserved.
 *
 * This software is the confidential and proprietary information of TH(ThreeHelp) Software Studio
 * You shall not disclose such Confidential Information 
 * and shall use it only in accordance with the terms of the license agreement 
 * you entered into with TH(ThreeHelp) Software Studio
 *
 */

package com.th.frame.util.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * DateHelper.java
 * <p>@description:</p>
 * @author css
 * @since Dec 31, 2012 2:31:24 PM created by css
 * @version 1.1 <p>create</p>
 *
 */
public class DateHelper {

	/**
	 * 时间格式为：yyyyMMddHHmmssSSSS
	 */
	public final static String DATE_FORMAT_yyyyMMddHHmmssSSSS = "yyyyMMddHHmmssSSSS";

	/**
	 * 时间格式为：yyyy-MM-dd HH:mm:ss.SSS
	 */
	public final static String DATE_FORMAT_yyyy_MM_ddHHmmssSSSS = "yyyy-MM-dd HH:mm:ss.SSS";

	/**
	 * 时间格式为：yy-MM-dd HH:mm:ss.SSS
	 */
	public final static String DATE_FORMAT_yy_MM_ddHHmmssSSSS = "yy-MM-dd HH:mm:ss.SSS";

	/**
	 * 时间格式为：yyyyMMddHHmmss
	 */
	public final static String DATE_FORMAT_yyyyMMddHHmmss = "yyyyMMddHHmmss";

	/**
	 * 时间格式为：yyyy-MM-dd HH:mm:ss
	 */
	public final static String DATE_FORMAT_yyyy_MM_ddHHmmss = "yyyy-MM-dd HH:mm:ss";

	/**
	 * 时间格式为：yy-MM-dd HH:mm:ss
	 */
	public final static String DATE_FORMAT_yy_MM_ddHHmmss = "yy-MM-dd HH:mm:ss";

	/**
	 * 时间格式为：dd.MM.yyyy HH:mm:ss
	 */
	public final static String DATE_FORMAT_dd_MM_yyyyHHmmss = "dd.MM.yyyy HH:mm:ss";

	/**
	 * 时间格式为：M/d/yy hh:mm:ss
	 */
	public final static String DATE_FORMAT_M_d_yyHHmmss = "M/d/yy hh:mm:ss";

	/**
	 * 时间格式为：M/d/yyyy hh:mm:ss
	 */
	public final static String DATE_FORMAT_M_d_yyyyHHmmss = "M/d/yyyy hh:mm:ss";

	/**
	 * 时间格式为：M/d/yy hh:mm a
	 */
	public final static String DATE_FORMAT_M_d_yyHHmma = "M/d/yy hh:mm a";

	/**
	 * 时间格式为：M/d/yyyy hh:mm a
	 */
	public final static String DATE_FORMAT_M_d_yyyyHHmma = "M/d/yyyy hh:mm a";

	/**
	 * 时间格式为：M/d/yy hh:mm a
	 */
	public final static String DATE_FORMAT_M_d_yyHHmm = "M/d/yy hh:mm";

	/**
	 * 时间格式为：M/d/yyyy hh:mm
	 */
	public final static String DATE_FORMAT_M_d_yyyyHHmm = "M/d/yyyy hh:mm";

	/**
	 * 时间格式为：M-d-yy HH:mm
	 */
	public final static String DATE_FORMAT_M_d_yy_HHmm = "M-d-yy HH:mm";

	/**
	 * 时间格式为：M-d-yyyy HH:mm
	 */
	public final static String DATE_FORMAT_M_d_yyyy_HHmm = "M-d-yyyy HH:mm";

	/**
	 * 时间格式为：yyyyMMdd
	 */
	public final static String DATE_FORMAT_yyyyMMdd = "yyyyMMdd";

	/**
	 * 时间格式为：yyyy-MM-dd
	 */
	public final static String DATE_FORMAT_yyyy_MM_dd = "yyyy-MM-dd";
	
	/**
	 * 时间格式为：yyyy-MM-dd
	 */
	public final static String DATE_FORMAT_yyyy_MM = "yyyy-MM";	

	/**
	 * 时间格式为：MM-dd-yyyy
	 */
	public final static String DATE_FORMAT_MM_dd_yyyy = "MM-dd-yyyy";

	/**
	 * 时间格式为：M-d-yyyy
	 */
	public final static String DATE_FORMAT_M_d_yyyy = "M-d-yyyy";

	/**
	 * 时间格式为：M-d-yy
	 */
	public final static String DATE_FORMAT_M_d_yy = "M-d-yy";

	/**
	 * 时间格式为：dd/MM/yyyy
	 */
	public final static String DATE_FORMAT_ddMMyyyy = "dd/MM/yyyy";

	/**
	 * 时间格式为：MM/dd/yyyy
	 */
	public final static String DATE_FORMAT_MMddyyyy = "MM/dd/yyyy";

	/**
	 * 时间格式为：MMMM d, yyyy
	 */
	public final static String DATE_FORMAT_MMMMdyyyy = "MMMM d, yyyy";

	/**
	 * 时间格式为：MM
	 */
	public final static String DATE_FORMAT_MM = "MM";

	/**
	 * 时间格式为：yyyy
	 */
	public final static String DATE_FORMAT_yyyy = "yyyy";

	/**
	 * 时间格式为：dd
	 */
	public final static String DATE_FORMAT_dd = "dd";

	/**
	 * 时间格式为：HHmmss
	 */
	public final static String DATE_FORMAT_HHmmss = "HHmmss";

	/**
	 * 根据秒数,返回时分秒
	 * 
	 * @param _second
	 *            秒数
	 * @return String
	 */
	public static String getTimeBySecond(String _second) {
		String returnTime = "";
		long longHour = 0;
		long longMinu = 0;
		long longSec = 0;
		try {
			longSec = Long.parseLong(_second);
			if (longSec == 0) {
				returnTime = "0时0分0秒";
				return returnTime;
			}
			longHour = longSec / 3600;

			longSec = longSec % 3600;
			longMinu = longSec / 60;
			
			longSec = longSec % 60;
			
			returnTime = longHour + "时" + longMinu + "分" + longSec + "秒";
			
			return returnTime;
		} catch (Exception e) {
			return "0时0分0秒";
		}

	}

	/**
	 * @param dates
	 *            长度为6位、8位和14位日期的字符串
	 * @return 6位、8位和14位日期格式转换为年月日的格式
	 */
	public static String dateToTime(String dates) {
		String time = dates;
		if (time != null && time.length() == 14) {
			String year = time.substring(0, 4);
			String month = time.substring(4, 6);
			String date = time.substring(6, 8);
			String hour = time.substring(8, 10);
			String minute = time.substring(10, 12);
			String second = time.substring(12, 14);
			time = year + "年" + month + "月" + date + "日 " + hour + "时" + minute
					+ "分" + second + "秒";
		}
		if (time != null && time.length() == 8) {
			String year = time.substring(0, 4);
			String month = time.substring(4, 6);
			String date = time.substring(6, 8);
			time = year + "年" + month + "月" + date + "日";
		}
		if (time != null && time.length() == 6) {
			String year = time.substring(0, 4);
			String month = time.substring(4, 6);
			time = year + "年 " + month + "月";
		}
		return time;
	}

	/**
	 * 
	 * @return 获取当前格式为yyyyMMddHHmmss的日期
	 */
	public static String nowDate() {
		return nowDate(DATE_FORMAT_yyyyMMddHHmmss);
	}

	/**
	 * @param dateFormat
	 *            日期格式
	 * @return 获取当前格式为dateFormat的日期
	 */
	public static String nowDate(String dateFormat) {
		Date now = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat(dateFormat);
		return formatter.format(now);
	}

	/**
	 * @return 当前第几周
	 */
	public static int nowWeek() {
		Calendar calendar = Calendar.getInstance();
		return calendar.get(Calendar.WEEK_OF_YEAR);
	}

	/**
	 * 
	 * @return 当前xxxx年
	 */
	public static int nowYear() {
		Calendar calendar = Calendar.getInstance();
		return calendar.get(Calendar.YEAR);
	}

	/**
	 * @param week
	 * @return
	 */
	public static int year(int week) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.WEEK_OF_YEAR, week);
		return calendar.get(Calendar.YEAR);
	}

	/**
	 * @param week
	 * @param year
	 * @return
	 */
	public static String allDate(int week, int year) {
		Calendar calendar = Calendar.getInstance();
		if (year > 0) {
			calendar.set(Calendar.YEAR, year);
		}
		calendar.set(Calendar.WEEK_OF_YEAR, week);
		calendar.set(Calendar.DAY_OF_WEEK, 1);
		String nowDate = calendar.get(Calendar.YEAR) + "年 " + week + "周 ";

		nowDate += calendar.get(Calendar.YEAR) + "年"
				+ (calendar.get(Calendar.MONTH) + 1) + "月"
				+ calendar.get(Calendar.DAY_OF_MONTH) + "日";
		nowDate += " 至 ";
		calendar.set(Calendar.DAY_OF_WEEK, 7);
		nowDate += calendar.get(Calendar.YEAR) + "年 "
				+ (calendar.get(Calendar.MONTH) + 1) + "月"
				+ calendar.get(Calendar.DAY_OF_MONTH) + "日";

		return nowDate;
	}

	/**
	 * 通过年、周、天返回相应的日期
	 * 
	 * @param year
	 * @param week
	 * @param days
	 * @return ymd
	 */
	public static String getYmd(int year, int week, int days) {

		Calendar calendar = Calendar.getInstance();
		if (year > 0) {
			calendar.set(Calendar.YEAR, year);
		}
		calendar.set(Calendar.WEEK_OF_YEAR, week);
		calendar.set(Calendar.DAY_OF_WEEK, days);
		int month = calendar.get(Calendar.MONTH) + 1;
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		String ymd = calendar.get(Calendar.YEAR) + "";
		if (month < 10) {
			ymd += "0" + month;
		} else {
			ymd += month;
		}
		if (day < 10) {
			ymd += "0" + day;
		} else {
			ymd += day;
		}

		return ymd;
	}


	/**
	 * @return
	 */
	public static String getEndDate(int useMonth) {

		Calendar calendar = Calendar.getInstance();
		int months = calendar.get(Calendar.MONTH);
		if (useMonth > 0) {
			calendar.set(Calendar.MONTH, useMonth + months);
		}
		int month = calendar.get(Calendar.MONTH) + 1;
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		String ymd = calendar.get(Calendar.YEAR) + "";
		if (month < 10) {
			ymd += "0" + month;
		} else {
			ymd += month;
		}
		if (day < 10) {
			ymd += "0" + day;
		} else {
			ymd += day;
		}

		return ymd;
	}
	
}
