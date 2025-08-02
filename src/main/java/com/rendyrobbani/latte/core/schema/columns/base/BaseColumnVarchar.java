package com.rendyrobbani.latte.core.schema.columns.base;

import com.rendyrobbani.latte.core.enums.type.column.ColumnTypeSql;
import com.rendyrobbani.latte.core.schema.DatabaseColumn;
import com.rendyrobbani.latte.core.schema.DatabaseColumnType;

public class BaseColumnVarchar extends DatabaseColumn {

	public BaseColumnVarchar(String size, String name, boolean isNullable) {
		super(new DatabaseColumnType(ColumnTypeSql.BASE_VARCHAR, size), name, isNullable);
	}

	public BaseColumnVarchar(String size, String name) {
		super(new DatabaseColumnType(ColumnTypeSql.BASE_VARCHAR, size), name);
	}

	public BaseColumnVarchar(String name, boolean isNullable) {
		super(new DatabaseColumnType(ColumnTypeSql.BASE_VARCHAR), name, isNullable);
	}

	public BaseColumnVarchar(String name) {
		super(new DatabaseColumnType(ColumnTypeSql.BASE_VARCHAR), name);
	}

}