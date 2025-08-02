package com.rendyrobbani.latte.core.schema.columns.base;

import com.rendyrobbani.latte.core.enums.type.column.ColumnTypeSql;
import com.rendyrobbani.latte.core.schema.DatabaseColumn;
import com.rendyrobbani.latte.core.schema.DatabaseColumnType;

public class BaseColumnBoolean extends DatabaseColumn {

	public BaseColumnBoolean(String name) {
		super(new DatabaseColumnType(ColumnTypeSql.BASE_BOOLEAN), name, false);
	}

}