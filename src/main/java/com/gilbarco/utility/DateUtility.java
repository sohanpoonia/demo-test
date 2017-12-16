package com.gilbarco.utility;

import java.text.SimpleDateFormat;
import java.util.Date;
import static java.util.TimeZone.getTimeZone;
import org.apache.commons.lang3.StringUtils;
import com.gilbarco.common.CommonConstants;

public class DateUtility {

	public static final String formatCurrentDate() {
		//if required: instead of a constant Format the same can be taken as input from user in a parameter and we can use below method
		SimpleDateFormat formater = new SimpleDateFormat(CommonConstants.CUSTOM_DATE_TIME_FORMAT);
		return formater.format(new Date());

	}
	public static final String formatDate(final java.util.Date a_date, String a_pattern,final String timezone) {
		
		final SimpleDateFormat formater = new SimpleDateFormat(a_pattern);
		if(StringUtils.isNotBlank(timezone)){
			formater.setTimeZone(getTimeZone(timezone));
		}
		final String ds = formater.format(a_date);
		return ds;
	}

}
