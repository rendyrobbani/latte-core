package com.rendyrobbani.latte.core.schema.columns.base.date;

import com.rendyrobbani.latte.core.enums.type.column.ColumnTypeSql;
import com.rendyrobbani.latte.core.schema.DatabaseColumn;
import com.rendyrobbani.latte.core.schema.DatabaseColumnType;

public final class BaseColumnDateOnly extends DatabaseColumn {

	public BaseColumnDateOnly(String name, boolean isNullable) {
		super(new DatabaseColumnType(ColumnTypeSql.BASE_DATEONLY), name, isNullable);
	}

	public BaseColumnDateOnly(String name) {
		super(new DatabaseColumnType(ColumnTypeSql.BASE_DATEONLY), name);
	}

}