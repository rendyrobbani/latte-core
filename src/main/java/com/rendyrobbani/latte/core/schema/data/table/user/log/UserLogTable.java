package com.rendyrobbani.latte.core.schema.data.table.user.log;

import com.rendyrobbani.espresso.schema.base.Constraint;
import com.rendyrobbani.espresso.schema.base.Table;
import com.rendyrobbani.latte.core.schema.data.table.user.UserTable;
import com.rendyrobbani.latte.core.schema.factory.LatteForeignKeyFactory;
import com.rendyrobbani.latte.core.schema.factory.LatteTableFactory;
import com.rendyrobbani.latte.core.schema.impl.AuditableBaseLibrary;
import com.rendyrobbani.latte.core.schema.impl.LockableBaseLibrary;
import com.rendyrobbani.latte.core.schema.impl.LoggableBaseLibrary;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class UserLogTable {

	private static Table table;

	public static Table getTable() {
		if (table == null) table = LatteTableFactory.createLog(UserTable.getTable());
		return table;
	}

	private static List<Constraint> foreignKeys;

	public static List<Constraint> getForeignKeys() {
		if (foreignKeys == null) {
			foreignKeys = new ArrayList<>();
			foreignKeys.addAll(AuditableBaseLibrary.getInstance().getForeignKeys(foreignKeys.size(), getTable()));
			foreignKeys.addAll(LockableBaseLibrary.getInstance().getForeignKeys(foreignKeys.size(), getTable()));
			foreignKeys.addAll(LoggableBaseLibrary.getInstance().getForeignKeys(foreignKeys.size(), getTable()));
			foreignKeys.add(LatteForeignKeyFactory.createLog(foreignKeys.size(), getTable(), UserTable.getTable()));
		}
		return foreignKeys;
	}

}