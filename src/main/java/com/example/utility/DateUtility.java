package com.example.utility;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.example.common.CommonConstants;

public class DateUtility {

	public static final String formatCurrentDate() {
		SimpleDateFormat formater = new SimpleDateFormat(CommonConstants.CUSTOM_DATE_TIME_FORMAT);
		return formater.format(new Date());

	}

}
