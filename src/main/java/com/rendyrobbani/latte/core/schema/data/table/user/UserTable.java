package com.rendyrobbani.latte.core.schema.data.table.user;

import com.rendyrobbani.espresso.schema.base.Column;
import com.rendyrobbani.espresso.schema.base.Constraint;
import com.rendyrobbani.espresso.schema.base.Table;
import com.rendyrobbani.espresso.schema.fact.TableFactory;
import com.rendyrobbani.espresso.schema.fact.column.common.*;
import com.rendyrobbani.espresso.schema.fact.column.special.GenderColumnFactory;
import com.rendyrobbani.espresso.schema.fact.column.special.NIPColumnFactory;
import com.rendyrobbani.espresso.schema.fact.column.special.PangkatASNColumnFactory;
import com.rendyrobbani.latte.core.schema.impl.AuditableBaseLibrary;
import com.rendyrobbani.latte.core.schema.impl.LockableBaseLibrary;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class UserTable {

	private static Table table;

	public static Table getTable() {
		if (table == null) {
			var columns = new ArrayList<Column>();
			columns.add(NIPColumnFactory.create("id", false, true));
			columns.add(PangkatASNColumnFactory.create("pangkat", false));
			columns.add(VarCharColumnFactory.create("name", false));
			columns.add(VarCharColumnFactory.create("title_prefix"));
			columns.add(VarCharColumnFactory.create("title_suffix"));
			columns.add(VarCharColumnFactory.create("password", false));
			columns.add(DateOnlyColumnFactory.create("birth_date", false));
			columns.add(DateOnlyColumnFactory.create("start_date"));
			columns.add(GenderColumnFactory.create("gender", false));
			columns.add(SmallIntColumnFactory.create("number", false));
			columns.add(BooleanColumnFactory.create("is_pns"));
			columns.add(BooleanColumnFactory.create("is_p3k"));
			columns.addAll(LockableBaseLibrary.getInstance().getColumns());
			columns.addAll(AuditableBaseLibrary.getInstance().getColumns());
			table = TableFactory.create("data_user", columns);
		}
		return table;
	}

	private static List<Constraint> foreignKeys;

	public static List<Constraint> getForeignKeys() {
		if (foreignKeys == null) {
			foreignKeys = new ArrayList<>();
			foreignKeys.addAll(AuditableBaseLibrary.getInstance().getForeignKeys(foreignKeys.size(), getTable()));
			foreignKeys.addAll(LockableBaseLibrary.getInstance().getForeignKeys(foreignKeys.size(), getTable()));
		}
		return foreignKeys;
	}

}