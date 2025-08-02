package com.rendyrobbani.latte.core.schema.columns.base;

import com.rendyrobbani.latte.core.enums.type.column.ColumnTypeSql;
import com.rendyrobbani.latte.core.schema.DatabaseColumn;
import com.rendyrobbani.latte.core.schema.DatabaseColumnType;

public class BaseColumnSmallint extends DatabaseColumn {

	public BaseColumnSmallint(String name, boolean isNullable) {
		super(new DatabaseColumnType(ColumnTypeSql.BASE_SMALLINT), name, isNullable);
	}

	public BaseColumnSmallint(String name) {
		super(new DatabaseColumnType(ColumnTypeSql.BASE_SMALLINT), name);
	}

}