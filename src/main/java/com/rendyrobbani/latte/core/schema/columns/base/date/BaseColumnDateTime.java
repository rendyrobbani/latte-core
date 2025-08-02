package com.rendyrobbani.latte.core.schema.columns.base.date;

import com.rendyrobbani.latte.core.enums.type.column.ColumnTypeSql;
import com.rendyrobbani.latte.core.schema.DatabaseColumn;
import com.rendyrobbani.latte.core.schema.DatabaseColumnType;

public final class BaseColumnDateTime extends DatabaseColumn {

	public BaseColumnDateTime(String name, boolean isNullable) {
		super(new DatabaseColumnType(ColumnTypeSql.BASE_DATETIME), name, isNullable);
	}

	public BaseColumnDateTime(String name) {
		super(new DatabaseColumnType(ColumnTypeSql.BASE_DATETIME), name);
	}

}