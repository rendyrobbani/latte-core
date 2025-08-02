package com.rendyrobbani.latte.core.schema.columns.base.audit;

import com.rendyrobbani.latte.core.domain.common.Column;
import com.rendyrobbani.latte.core.schema.columns.base.BaseColumnBoolean;
import com.rendyrobbani.latte.core.schema.columns.base.date.BaseColumnDateTime;
import com.rendyrobbani.latte.core.schema.columns.base.user.BaseColumnUserId;

import java.util.ArrayList;
import java.util.List;

public final class BaseAuditColumns {

	private BaseAuditColumns() {
		throw new IllegalStateException("Singleton class");
	}

	private static List<Column> columns;

	public static List<Column> getColumns() {
		if (columns == null) {
			columns = new ArrayList<>();
			columns.add(new BaseColumnDateTime( "created_at"));
			columns.add(new BaseColumnUserId( "created_by"));
			columns.add(new BaseColumnDateTime( "updated_at"));
			columns.add(new BaseColumnUserId( "updated_by"));
			columns.add(new BaseColumnBoolean( "is_deleted"));
			columns.add(new BaseColumnDateTime( "deleted_at"));
			columns.add(new BaseColumnUserId( "deleted_by"));
		}
		return columns;
	}

}