package com.rendyrobbani.latte.core.domain.common;

import com.rendyrobbani.latte.core.util.string.StringUtil;

public interface Column {

	String getName();

	default String getNameOfTitleCase() {
		if (this.getName() == null) return null;
		return StringUtil.toNameOfData(this.getName());
	}

	default String getNameOfCamelCase() {
		if (this.getName() == null) return null;
		return this.getNameOfTitleCase().substring(0, 1).toLowerCase() + this.getNameOfTitleCase().substring(1);
	}

	ColumnType getType();

	boolean isNullable();

	boolean isPrimaryKey();

	boolean isAutoIncrement();

}