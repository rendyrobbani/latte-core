package com.rendyrobbani.latte.core.schema.columns.base.pangkat;

import com.rendyrobbani.latte.core.enums.type.column.ColumnTypeSql;
import com.rendyrobbani.latte.core.schema.DatabaseColumn;
import com.rendyrobbani.latte.core.schema.DatabaseColumnType;

public final class BaseColumnPangkat extends DatabaseColumn {

	private static final DatabaseColumnType type = new DatabaseColumnType(ColumnTypeSql.ENUM_PANGKAT);

	public BaseColumnPangkat(String name, boolean isNullable, boolean isPrimaryKey) {
		super(type, name, isNullable, isPrimaryKey);
	}

	public BaseColumnPangkat(String name, boolean isNullable) {
		super(type, name, isNullable);
	}

	public BaseColumnPangkat(String name) {
		super(type, name);
	}

}