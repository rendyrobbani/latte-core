package com.rendyrobbani.latte.core.util.string;

import com.rendyrobbani.latte.core.util.string.cases.CaseUtil;

import java.util.Map;

public final class StringUtil {

	public StringUtil() {
		throw new IllegalStateException("Utility class");
	}

	public static String toTitleCase(String value) {
		return CaseUtil.toTitleCase(value, null, null);
	}

	public static String toNameOfData(String tableName) {
		return CaseUtil.toTitleCase(tableName, Map.of("_", " "), Map.of(" ", ""));
	}

}