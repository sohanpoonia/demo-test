package com.gilbarco.utility;

import org.apache.log4j.Logger;

public class ApplicationLogger {

	public static void trace(final Class clazz, final Object ...paramObject) {
		Logger logger = Logger.getLogger(clazz);
		if(logger.isTraceEnabled()) {
			logger.trace(getMessage(paramObject));
		}
	}

	public static void trace(final Class clazz, final Throwable paramThrowable,final Object ...paramObject) {
		Logger logger = Logger.getLogger(clazz);
		if(logger.isTraceEnabled()) {
			logger.trace(getMessage(paramObject),paramThrowable);
		}
	}

	public static void info(final Class clazz, final Object ...paramObject) {
		Logger logger = Logger.getLogger(clazz);
		if(logger.isInfoEnabled()) {
			logger.info(getMessage(paramObject));
		}
	}

	public static void info(final Class clazz, final Throwable paramThrowable, final Object ...paramObject) {
		Logger logger = Logger.getLogger(clazz);
		if(logger.isInfoEnabled()) {
			logger.info(getMessage(paramObject),paramThrowable);
		}
	}

	public static void debug(final Class clazz, final Object ...paramObject) {
		Logger logger = Logger.getLogger(clazz);
		if(logger.isDebugEnabled()) {
			logger.debug(getMessage(paramObject));
		}
	}

	public static void debug(final Class clazz, final Throwable paramThrowable, final Object ...paramObject) {
		Logger logger = Logger.getLogger(clazz);
		if(logger.isDebugEnabled()) {
			logger.info(getMessage(paramObject),paramThrowable);
		}
	}

	public static void warn(final Class clazz,final Object ...paramObject) {
		Logger logger = Logger.getLogger(clazz);
		logger.warn(getMessage(paramObject));
	}

	public static void warn(final Class clazz, final Throwable paramThrowable, final Object ...paramObject) {
		Logger logger = Logger.getLogger(clazz);
		logger.warn(getMessage(paramObject),paramThrowable);
	}

	public static void error(final Class clazz, final Object ...paramObject) {
		Logger logger = Logger.getLogger(clazz);
		logger.error(getMessage(paramObject));
	}

	public static void error(final Class clazz, final Throwable paramThrowable, final Object ...paramObject) {
		Logger logger = Logger.getLogger(clazz);
		logger.error(getMessage(paramObject),paramThrowable);
	}

	public static void fatal(final Class clazz, final Object ...paramObject) {
		Logger logger = Logger.getLogger(clazz);
		logger.fatal(getMessage(paramObject));
	}

	public static void fatal(final Class clazz, final Throwable paramThrowable, final Object paramObject) {
		Logger logger = Logger.getLogger(clazz);
		logger.error(getMessage(paramObject),paramThrowable);
	}

	public static String getMessage(final Object ...paramObject) {
		final StringBuffer message = new StringBuffer();
		if(paramObject != null && paramObject.length > 0) {
			for (Object paramObj : paramObject) {
				message.append(paramObj).append(" ");
			}
		}
		return message.toString();
	}
}
