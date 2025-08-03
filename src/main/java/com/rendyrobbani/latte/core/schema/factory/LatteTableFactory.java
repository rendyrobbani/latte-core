package com.rendyrobbani.latte.core.schema.factory;

import com.rendyrobbani.espresso.schema.base.Column;
import com.rendyrobbani.espresso.schema.base.Table;
import com.rendyrobbani.espresso.schema.fact.ColumnFactory;
import com.rendyrobbani.espresso.schema.fact.TableFactory;
import com.rendyrobbani.espresso.schema.fact.column.common.BigIntColumnFactory;
import com.rendyrobbani.latte.core.schema.impl.LoggableBaseLibrary;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class LatteTableFactory {

	public static Table createLog(Table subject) {
		var columns = new ArrayList<Column>();
		columns.add(BigIntColumnFactory.create("id", false, true, true));

		for (var column : subject.getColumns()) {
			if (column.isPrimaryKey()) columns.add(ColumnFactory.copyOf(column, "subject_id", false));
			else columns.add(column);
		}

		columns.addAll(LoggableBaseLibrary.getInstance().getColumns());

		return TableFactory.create(subject.getName() + "_log", columns);
	}

}