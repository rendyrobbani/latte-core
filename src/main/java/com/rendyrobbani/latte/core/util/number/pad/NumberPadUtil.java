package com.rendyrobbani.latte.core.util.number.pad;

public final class NumberPadUtil {

	public NumberPadUtil() {
		throw new IllegalStateException("Utility class");
	}

	public static String lpad(String text, int length, String pad) {
		if (length < 1) return text;

		if (text == null) return null;
		if (text.isBlank()) return text;
		if (text.length() >= length) return text;

		if (pad == null) return text;
		if (pad.isBlank()) return text;

		var value = new String[length - text.length()];
		for (int i = 0; i < length - text.length(); i++) value[i] = pad;
		return String.join("", value) + text;
	}

}