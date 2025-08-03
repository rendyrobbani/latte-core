package com.rendyrobbani.latte.core.schema.factory;

import com.rendyrobbani.espresso.common.base.NIP;
import com.rendyrobbani.espresso.schema.base.Column;
import com.rendyrobbani.espresso.schema.base.Table;
import com.rendyrobbani.espresso.schema.base.constraint.Check;
import com.rendyrobbani.espresso.schema.fact.constraint.CheckFactory;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class LatteCheckFactory {

	public static Check create(Integer index, Table table, String logic) {
		var name = CheckFactory.createSimpleName(table, index);
		return CheckFactory.create(name, table, logic);
	}

	public static Check createColumnEqualValue(Integer index, Table table, Column column, String value) {
		return create(index, table, column.getName() + " = " + value);
	}

	public static Check createColumnEqualColumn(Integer index, Table table, Column column1, Column column2) {
		return createColumnEqualValue(index, table, column1, column2.getName());
	}

	public static Check createColumnLikeValue(Integer index, Table table, Column column, String value) {
		return create(index, table, column.getName() + " like " + value);
	}

	public static Check createColumnLikeColumn(Integer index, Table table, Column column1, Column column2) {
		return createColumnLikeValue(index, table, column1, column2.getName());
	}

	public static Check createColumnMatchPattern(Integer index, Table table, Column column, String pattern) {
		return create(index, table, column.getName() + " regexp '" + pattern + "'");
	}

	public static Check createColumnMatchNIP(Integer index, Table table, Column column) {
		return createColumnMatchPattern(index, table, column, NIP.REGEX);
	}

}