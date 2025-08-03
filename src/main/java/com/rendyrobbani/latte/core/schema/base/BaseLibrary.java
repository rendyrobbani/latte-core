package com.rendyrobbani.latte.core.schema.base;

import com.rendyrobbani.espresso.schema.base.Column;
import com.rendyrobbani.espresso.schema.base.Constraint;
import com.rendyrobbani.espresso.schema.base.Table;
import com.rendyrobbani.latte.core.schema.data.table.user.UserTable;
import com.rendyrobbani.latte.core.schema.factory.LatteForeignKeyFactory;

import java.util.ArrayList;
import java.util.List;

public interface BaseLibrary {

	List<Column> getColumns();

	default List<Constraint> getChecks() {
		return List.of();
	}

	default List<Constraint> getUniqueKeys() {
		return List.of();
	}

	default List<Constraint> getForeignKeys(int index, Table table) {
		var foreignKeys = new ArrayList<Constraint>();
		for (var column : getColumns()) {
			if (column.getName().endsWith("_by")) {
				index++;
				foreignKeys.add(LatteForeignKeyFactory.create(index, table, List.of(column), UserTable.getTable(), List.of(UserTable.getTable().getColumnId())));
			}
		}
		return foreignKeys;
	}

}