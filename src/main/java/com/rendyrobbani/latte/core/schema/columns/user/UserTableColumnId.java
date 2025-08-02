package com.rendyrobbani.latte.core.schema.columns.user;

import com.rendyrobbani.latte.core.domain.common.Column;
import com.rendyrobbani.latte.core.schema.columns.base.user.BaseColumnUserId;

public final class UserTableColumnId {

	public UserTableColumnId() {
		throw new IllegalStateException("Singleton class");
	}

	private static Column instance;

	public static Column getInstance() {
		if (instance == null) instance = new BaseColumnUserId("id", false, true);
		return instance;
	}

}