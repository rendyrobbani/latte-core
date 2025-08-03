package com.rendyrobbani.latte.core.schema.data.table.master.fungsi;

import com.rendyrobbani.espresso.common.data.classify.fungsi.FungsiClassification;
import com.rendyrobbani.espresso.schema.base.Column;
import com.rendyrobbani.espresso.schema.base.Constraint;
import com.rendyrobbani.espresso.schema.base.Table;
import com.rendyrobbani.espresso.schema.fact.TableFactory;
import com.rendyrobbani.espresso.schema.fact.column.common.BooleanColumnFactory;
import com.rendyrobbani.espresso.schema.fact.column.common.CharColumnFactory;
import com.rendyrobbani.espresso.schema.fact.column.common.VarCharColumnFactory;
import com.rendyrobbani.latte.core.schema.factory.LatteCheckFactory;
import com.rendyrobbani.latte.core.schema.impl.AuditableBaseLibrary;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class DataMasterFungsiTable {

	private static Table table;

	public static Table getTable() {
		if (table == null) {
			var columns = new ArrayList<Column>();
			columns.add(CharColumnFactory.create("id", 2, false, true));
			columns.add(CharColumnFactory.create("code", 2, false));
			columns.add(VarCharColumnFactory.create("name", false));
			columns.add(BooleanColumnFactory.create("is_enabled", false));
			columns.addAll(AuditableBaseLibrary.getInstance().getColumns());
			table = TableFactory.create("data_master_fungsi", columns);
		}
		return table;
	}

	private static List<Constraint> checks;

	public static List<Constraint> getChecks() {
		if (checks == null) {
			checks = new ArrayList<>();
			checks.add(LatteCheckFactory.createColumnEqualColumn(1, getTable(), getTable().findColumn("id"), getTable().findColumn("code")));
			checks.add(LatteCheckFactory.createColumnMatchPattern(2, getTable(), getTable().getColumnId(), FungsiClassification.FUNGSI_REGEX_GROUP));
		}
		return checks;
	}

}