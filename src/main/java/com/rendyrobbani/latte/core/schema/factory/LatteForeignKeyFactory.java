package com.rendyrobbani.latte.core.schema.factory;

import com.rendyrobbani.espresso.schema.base.Column;
import com.rendyrobbani.espresso.schema.base.Table;
import com.rendyrobbani.espresso.schema.base.constraint.ForeignKey;
import com.rendyrobbani.espresso.schema.fact.constraint.ForeignKeyFactory;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class LatteForeignKeyFactory {

	public static ForeignKey create(Integer index, Table table, List<Column> columns, Table referenceTable, List<Column> referenceColumns) {
		var name = ForeignKeyFactory.createSimpleName(table, index);
		return ForeignKeyFactory.create(name, table, columns, referenceTable, referenceColumns);
	}

	public static ForeignKey createLog(Integer index, Table table, Table referenceTable) {
		return create(index, table, List.of(table.findColumn("subject_id")), referenceTable, List.of(referenceTable.getColumnId()));
	}

}