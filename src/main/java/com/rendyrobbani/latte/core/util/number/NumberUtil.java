package com.rendyrobbani.latte.core.util.number;

import com.rendyrobbani.latte.core.util.number.pad.NumberPadUtil;
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

	public static String lpad(String text, int length, String pad) {
		return NumberPadUtil.lpad(text, length, pad);
	}

	public static String lpad(String text, int length) {
		return NumberPadUtil.lpad(text, length, "0");
	}

	public static String lpad(int number, int length, String pad) {
		return NumberPadUtil.lpad(String.valueOf(number), length, pad);
	}

	public static String lpad(int number, int length) {
		return NumberPadUtil.lpad(String.valueOf(number), length, "0");
	}

	public static String lpad(long number, int length, String pad) {
		return NumberPadUtil.lpad(String.valueOf(number), length, pad);
	}

	public static String lpad(long number, int length) {
		return NumberPadUtil.lpad(String.valueOf(number), length, "0");
	}

}