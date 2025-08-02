package com.rendyrobbani.latte.core.domain.common;

import com.rendyrobbani.latte.core.util.string.StringUtil;

import java.util.ArrayList;
import java.util.List;

public interface Table {

	String ENGINE = "innodb";
	String CHARSET = "utf8mb4";
	String COLLATE = "utf8mb4_unicode_ci";

	String getName();

	default String getNameForData() {
		if (this.getName() == null) return null;
		return StringUtil.toNameOfData(this.getName().replace("core_user", "data_user"));
	}

	default String getNameForEntity() {
		if (this.getNameForData() == null) return null;
		return this.getNameForData() + "Entity";
	}

	default String getNameForRepository() {
		if (this.getNameForData() == null) return null;
		return this.getNameForData() + "Repository";
	}

	List<Column> getColumns();

	default String getDDL(boolean beautify) {
		var values = new ArrayList<String>();
		values.add("create or replace table " + this.getName() + " (");
		if (beautify) {
			int maxName = 0;
			int maxType = 0;
			for (var column : this.getColumns()) {
				maxName = Math.max(maxName, column.getName().length());
				maxType = Math.max(maxType, column.getType().getSqlWithSize().length());
			}
			for (var column : this.getColumns()) {
				var name = column.getName() + " ".repeat(maxName - column.getName().length());
				var type = column.getType().getSqlWithSize() + " ".repeat(maxType - column.getType().getSqlWithSize().length());
				var attr = column.isNullable() ? "null" : "not null";
				if (column.isAutoIncrement()) attr += " auto_increment";
				values.add("\t" + String.join(" ", name, type, attr) + ",");
			}
			values.add("\t" + "primary key (" + String.join(", ", this.getPrimaryKeys().stream().map(Column::getName).toList()) + ")");

			values.add(") engine = " + ENGINE);
			values.add("  charset = " + CHARSET);
			values.add("  collate = " + COLLATE + ";");
			return String.join("\n", values);
		} else {
			for (var column : this.getColumns()) {
				values.add(String.join(" ", column.getName(), column.getType().getSqlWithSize()) + ", ");
			}
			values.add("primary key (" + String.join(", ", this.getPrimaryKeys().stream().map(Column::getName).toList()) + ")");
			values.add(") engine = " + ENGINE + " charset = " + CHARSET + " collate = " + COLLATE + ";");
			return String.join("", values);
		}
	}

	default String getDDL() {
		return this.getDDL(false);
	}

	default List<Column> getPrimaryKeys() {
		var keys = new ArrayList<Column>();
		for (var column : this.getColumns()) if (column.isPrimaryKey()) keys.add(column);
		return keys;
	}

}