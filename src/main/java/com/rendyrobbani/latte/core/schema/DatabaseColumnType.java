package com.rendyrobbani.latte.core.schema;

import com.rendyrobbani.latte.core.domain.common.ColumnType;
import com.rendyrobbani.latte.core.enums.type.column.ColumnTypeJava;
import com.rendyrobbani.latte.core.enums.type.column.ColumnTypeSql;
import lombok.Getter;

@Getter
public final class DatabaseColumnType implements ColumnType {

	private final ColumnTypeJava java;

	private final ColumnTypeSql sql;

	private final String size;

	public DatabaseColumnType(ColumnTypeSql sql, String size) {
		if (sql == null) throw new IllegalArgumentException("Type of SQL cannot be null");
		this.sql = sql;
		this.java = sql.getTypeOfJava();
		this.size = size == null ? sql.getDefaultSize() : size;
	}

	public DatabaseColumnType(ColumnTypeSql sql) {
		this(sql, null);
	}

}