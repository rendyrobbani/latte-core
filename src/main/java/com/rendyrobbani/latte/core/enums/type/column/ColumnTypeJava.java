package com.rendyrobbani.latte.core.enums.type.column;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ColumnTypeJava {
	ENUM_GENDER("Gender", "com.rendyrobbani.latte.core.enums.gender.Gender"),
	ENUM_PANGKAT("Pangkat", "com.rendyrobbani.latte.core.enums.pangkat.Pangkat"),
	BASE_BIGDECIMAL("BigDecimal", "java.math.BigDecimal"),
	BASE_LOCALDATEONLY("LocalDate", "java.time.LocalDate"),
	BASE_LOCALDATETIME("LocalDateTime", "java.time.LocalDateTime"),
	BASE_BOOLEAN("Boolean", null),
	BASE_INTEGER("Integer", null),
	BASE_LONG("Long", null),
	BASE_STRING("String", null);

	private final String value;

	private final String pathToImported;

	private Boolean mustBeImported() {
		return this.pathToImported != null;
	}
}