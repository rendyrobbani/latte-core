package com.rendyrobbani.latte.core.enums.type.column;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ColumnTypeSql {
	ENUM_GENDER(ColumnTypeJava.ENUM_GENDER, "char"),
	ENUM_PANGKAT(ColumnTypeJava.ENUM_PANGKAT, "char"),
	BASE_CHAR(ColumnTypeJava.BASE_STRING, "char"),
	BASE_VARCHAR(ColumnTypeJava.BASE_STRING, "varchar"),
	BASE_TINYINT(ColumnTypeJava.BASE_INTEGER, "tinyint"),
	BASE_SMALLINT(ColumnTypeJava.BASE_INTEGER, "smallint"),
	BASE_BIGINT(ColumnTypeJava.BASE_LONG, "bigint"),
	BASE_BOOLEAN(ColumnTypeJava.BASE_BOOLEAN, "bit"),
	BASE_DATEONLY(ColumnTypeJava.BASE_LOCALDATEONLY, "date"),
	BASE_DATETIME(ColumnTypeJava.BASE_LOCALDATETIME, "datetime"),
	BASE_DECIMAL(ColumnTypeJava.BASE_BIGDECIMAL, "decimal");

	private final ColumnTypeJava typeOfJava;

	private final String value;

	public String getDefaultSize() {
		return switch (this) {
			case ENUM_PANGKAT -> "(2)";
			case BASE_CHAR, BASE_VARCHAR -> "(255)";
			case BASE_TINYINT -> "(4)";
			case BASE_SMALLINT -> "(6)";
			case BASE_BIGINT -> "(20)";
			case BASE_BOOLEAN -> "(1)";
			case BASE_DECIMAL -> "(38,2)";
			default -> "";
		};
	}
}