package com.rendyrobbani.latte.core.schema.tables.user;

import com.rendyrobbani.latte.core.domain.common.Column;
import com.rendyrobbani.latte.core.domain.common.Table;
import com.rendyrobbani.latte.core.schema.DatabaseTable;
import com.rendyrobbani.latte.core.schema.columns.base.BaseColumnBoolean;
import com.rendyrobbani.latte.core.schema.columns.base.BaseColumnSmallint;
import com.rendyrobbani.latte.core.schema.columns.base.audit.BaseAuditColumns;
import com.rendyrobbani.latte.core.schema.columns.base.date.BaseColumnDateOnly;
import com.rendyrobbani.latte.core.schema.columns.base.date.BaseColumnDateTime;
import com.rendyrobbani.latte.core.schema.columns.base.gender.BaseColumnGender;
import com.rendyrobbani.latte.core.schema.columns.base.pangkat.BaseColumnPangkat;
import com.rendyrobbani.latte.core.schema.columns.base.BaseColumnVarchar;
import com.rendyrobbani.latte.core.schema.columns.base.user.BaseColumnUserId;
import com.rendyrobbani.latte.core.schema.columns.user.*;

import java.util.ArrayList;

public final class UserTable {

	public UserTable() {
		throw new IllegalStateException("Singleton class");
	}

	private static Table instance;

	public static Table getInstance() {
		if (instance == null) {
			var columns = new ArrayList<Column>();
			columns.add(UserTableColumnId.getInstance());
			columns.add(new BaseColumnPangkat("pangkat", false));
			columns.add(new BaseColumnVarchar("name", false));
			columns.add(new BaseColumnVarchar("title_prefix"));
			columns.add(new BaseColumnVarchar("title_suffix"));
			columns.add(new BaseColumnVarchar("password", false));
			columns.add(new BaseColumnDateOnly("birth_date", false));
			columns.add(new BaseColumnDateOnly("start_date"));
			columns.add(new BaseColumnGender("gender", false));
			columns.add(new BaseColumnSmallint("number", false));
			columns.add(new BaseColumnBoolean("is_pns"));
			columns.add(new BaseColumnBoolean("is_p3k"));
			columns.add(new BaseColumnBoolean("is_locked"));
			columns.add(new BaseColumnDateTime("locked_at", true));
			columns.add(new BaseColumnUserId("locked_by", true));
			columns.addAll(BaseAuditColumns.getColumns());

			instance = new DatabaseTable("core_user", columns);
		}
		return instance;
	}

}