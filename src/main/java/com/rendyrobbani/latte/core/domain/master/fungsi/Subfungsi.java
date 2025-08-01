package com.rendyrobbani.latte.core.domain.master.fungsi;

import com.rendyrobbani.latte.core.domain.common.has.HasCode;
import com.rendyrobbani.latte.core.domain.common.has.HasName;

public interface Subfungsi extends HasCode, HasName {

	String REGEX_CODE_VALUE = "([0-9]*)";
	String REGEX_CODE_MATCH = "(" + Fungsi.REGEX_CODE_MATCH + "\\." + REGEX_CODE_VALUE + ")";
	String REGEX_CODE_GROUP = "^" + REGEX_CODE_MATCH + "$";

	@Override
	default String getCodeRegexValue() {
		return REGEX_CODE_VALUE;
	}

	@Override
	default String getCodeRegexMatch() {
		return REGEX_CODE_MATCH;
	}

	@Override
	default String getCodeRegexGroup() {
		return REGEX_CODE_GROUP;
	}

}