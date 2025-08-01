package com.rendyrobbani.latte.core.util.number;

import com.rendyrobbani.latte.core.util.number.roman.RomanNumberUtil;

public final class NumberUtil {

	public NumberUtil() {
		throw new IllegalStateException("Utility class");
	}

	public static String toRoman(int number) {
		return RomanNumberUtil.toRoman(number);
	}

	public static String toRoman(String number) {
		return RomanNumberUtil.toRoman(number);
	}

	public static int fromRoman(String roman) {
		return RomanNumberUtil.fromRoman(roman);
	}

}