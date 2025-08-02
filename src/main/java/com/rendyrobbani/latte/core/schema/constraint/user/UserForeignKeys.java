package com.rendyrobbani.latte.core.schema.constraint.user;

import com.rendyrobbani.latte.core.domain.common.contraint.ForeignKey;
import com.rendyrobbani.latte.core.schema.constraint.base.BaseForeignKeys;
import com.rendyrobbani.latte.core.schema.tables.user.UserTable;

import java.util.List;

public final class UserForeignKeys {

	public UserForeignKeys() {
		throw new IllegalArgumentException("Singleton class");
	}

	private static List<ForeignKey> instance;

	public static List<ForeignKey> getInstance() {
		if (instance == null) instance = BaseForeignKeys.getConstraints(UserTable.getInstance());
		return instance;
	}

}