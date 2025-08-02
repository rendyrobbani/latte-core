package com.rendyrobbani.latte.core.schema.constraint.base;

import com.rendyrobbani.latte.core.domain.common.Table;
import com.rendyrobbani.latte.core.domain.common.contraint.ForeignKey;
import com.rendyrobbani.latte.core.schema.columns.base.user.BaseColumnUserId;
import com.rendyrobbani.latte.core.schema.tables.DatabaseForeignKey;
import com.rendyrobbani.latte.core.schema.tables.user.UserTable;

import java.util.ArrayList;
import java.util.List;

public final class BaseForeignKeys {

	public BaseForeignKeys() {
		throw new IllegalStateException("Singleton class");
	}

	public static List<ForeignKey> getConstraints(Table table) {
		var keys = new ArrayList<ForeignKey>();
		for (var colName : List.of("created_by", "updated_by", "deleted_by")) {
			var actionBy = new BaseColumnUserId(colName);
			keys.add(new DatabaseForeignKey(keys.size() + 1, table, List.of(actionBy), UserTable.getInstance(), List.of(actionBy)));
		}
		return keys;
	}

}