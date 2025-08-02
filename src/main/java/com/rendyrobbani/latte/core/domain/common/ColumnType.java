package com.rendyrobbani.latte.core.domain.common;

import com.rendyrobbani.latte.core.enums.type.column.ColumnTypeJava;
import com.rendyrobbani.latte.core.enums.type.column.ColumnTypeSql;

public interface ColumnType {

	ColumnTypeSql getSql();

	default ColumnTypeJava getJava() {
		if (getSql() == null) return null;
		return getSql().getTypeOfJava();
	}

	default String getSize() {
		if (this.getSql() == null) return null;
		return this.getSql().getDefaultSize();
	}

	default String getSqlWithSize() {
		if (this.getSql() == null) return null;
		return this.getSql().getValue() + this.getSize();
	}

}