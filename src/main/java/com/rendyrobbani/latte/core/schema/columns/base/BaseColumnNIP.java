package com.rendyrobbani.latte.core.schema.columns.base;

import com.rendyrobbani.latte.core.enums.type.column.ColumnTypeSql;
import com.rendyrobbani.latte.core.schema.DatabaseColumn;
import com.rendyrobbani.latte.core.schema.DatabaseColumnType;

public class BaseColumnNIP extends DatabaseColumn {

	private static final DatabaseColumnType type = new DatabaseColumnType(ColumnTypeSql.BASE_CHAR, "(18)");

	public BaseColumnNIP(String name, boolean isNullable, boolean isPrimaryKey) {
		super(type, name, isNullable, isPrimaryKey);
	}

	public BaseColumnNIP(String name, boolean isNullable) {
		super(type, name, isNullable);
	}

	public BaseColumnNIP(String name) {
		super(type, name);
	}

}