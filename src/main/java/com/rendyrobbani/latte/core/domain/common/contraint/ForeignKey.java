package com.rendyrobbani.latte.core.domain.common.contraint;

import com.rendyrobbani.latte.core.domain.common.Column;
import com.rendyrobbani.latte.core.domain.common.Table;
import com.rendyrobbani.latte.core.util.number.NumberUtil;

import java.util.ArrayList;
import java.util.List;

public interface ForeignKey {

	Integer getOrder();

	Table getFromTable();

	List<Column> getFromColumns();

	Table getIntoTable();

	List<Column> getIntoColumns();

	default String getDDL() {
		var values = new ArrayList<String>();
		values.add("alter table");
		values.add(this.getFromTable().getName());
		values.add("add constraint");

		var tableName = this.getFromTable().getName();
		if (tableName.length() > 58) tableName = tableName.substring(0, 58);
		values.add("fk_" + tableName + "_" + NumberUtil.lpad(this.getOrder(), 2));

		values.add("foreign key");
		values.add("(" + String.join(", ", this.getFromColumns().stream().map(Column::getName).toList()) + ")");
		values.add("references");
		values.add(this.getIntoTable().getName());
		values.add("(" + String.join(", ", this.getIntoColumns().stream().map(Column::getName).toList()) + ")");
		return String.join(" ", values);
	}

}