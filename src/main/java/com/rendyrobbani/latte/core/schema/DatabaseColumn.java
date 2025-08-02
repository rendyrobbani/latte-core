package com.rendyrobbani.latte.core.schema;

import com.rendyrobbani.latte.core.domain.common.Column;
import lombok.Getter;

@Getter
public class DatabaseColumn implements Column {

	protected final DatabaseColumnType type;

	protected final String name;

	protected final String nameOfTitleCase;

	protected final String nameOfCamelCase;

	protected final boolean isNullable;

	protected final boolean isPrimaryKey;

	protected final boolean isAutoIncrement;

	public DatabaseColumn(DatabaseColumnType type, String name, boolean isNullable, boolean isPrimaryKey, boolean isAutoIncrement) {
		this.type = type;
		this.name = name;
		this.nameOfTitleCase = Column.super.getNameOfTitleCase();
		this.nameOfCamelCase = Column.super.getNameOfCamelCase();
		this.isAutoIncrement = isAutoIncrement;
		this.isPrimaryKey = this.isAutoIncrement || isPrimaryKey;
		this.isNullable = !this.isPrimaryKey && isNullable;
	}

	public DatabaseColumn(DatabaseColumnType type, String name, boolean isNullable, boolean isPrimaryKey) {
		this(type, name, isNullable, isPrimaryKey, false);
	}

	public DatabaseColumn(DatabaseColumnType type, String name, boolean isNullable) {
		this(type, name, isNullable, false);
	}

	public DatabaseColumn(DatabaseColumnType type, String name) {
		this(type, name, true, false);
	}

}