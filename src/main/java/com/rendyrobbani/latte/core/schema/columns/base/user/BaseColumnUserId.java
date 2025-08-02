package com.rendyrobbani.latte.core.schema.columns.base.user;

import com.rendyrobbani.latte.core.schema.columns.base.BaseColumnNIP;

public final class BaseColumnUserId extends BaseColumnNIP {

	public BaseColumnUserId(String name, boolean isNullable, boolean isPrimaryKey) {
		super(name, isNullable, isPrimaryKey);
	}

	public BaseColumnUserId(String name, boolean isNullable) {
		super(name, isNullable);
	}

	public BaseColumnUserId(String name) {
		super(name);
	}

}