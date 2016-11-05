package org.nj.cms.core.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * 日期集合类
 *
 * @author vvwang
 *
 */
public class DateUtils {
	public static final String FORMAT_DAY = "yyyy-MM-dd";

	public static final String FORMAT_DAY_LAST_SECOND = "yyyy-MM-dd 23:59:59";

	public static final String FORMAT_SECOND = "yyyy-MM-dd hh:mm:ss";

	/**
	 * 当前时间 （秒）
	 *
	 * @return
	 */
	public static long getCurrentTime() {
		return System.currentTimeMillis() / 1000;
	}

	/**
	 * 后台的时间
	 *
	 * @param day
	 * @return
	 */
	public static long getNextDayLastSecond(int day) {
		long time = getCurrentTime() + day * 86400;
		time = parse(format(time, FORMAT_DAY_LAST_SECOND), FORMAT_SECOND);
		return time / 1000;
	}

	/**
	 * 根据表达式解析日期时间
	 *
	 * @param text
	 * @param pattern
	 * @return
	 */
	public static long parse(String text, String pattern) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		long time = 0;
		try {
			time = sdf.parse(text).getTime();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return time;
	}

	/**
	 * 默认 年月日 日期格式化
	 *
	 * @param time
	 * @return
	 */
	public static String format(long time) {
		return format(time, FORMAT_DAY);
	}

	/**
	 * 指定日期格式化
	 *
	 * @param time
	 * @param pattern
	 * @return
	 */
	public static String format(long time, String pattern) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.format(time * 1000);
	}

	/**
	 * 是否是当前天的日期
	 *
	 * @param time
	 * @return
	 */
	public static boolean isCurrentDay(long time) {
		return format(time).equals(format(getCurrentTime()));
	}

}
