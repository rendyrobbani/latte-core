package com.rendyrobbani.latte.core.schema.columns.base.gender;

import com.rendyrobbani.latte.core.enums.type.column.ColumnTypeSql;
import com.rendyrobbani.latte.core.schema.DatabaseColumn;
import com.rendyrobbani.latte.core.schema.DatabaseColumnType;

public final class BaseColumnGender extends DatabaseColumn {

	private static final DatabaseColumnType type = new DatabaseColumnType(ColumnTypeSql.ENUM_GENDER);

	public BaseColumnGender(String name, boolean isNullable, boolean isPrimaryKey) {
		super(type, name, isNullable, isPrimaryKey);
	}

	public BaseColumnGender(String name, boolean isNullable) {
		super(type, name, isNullable);
	}

	public BaseColumnGender(String name) {
		super(type, name);
	}

}