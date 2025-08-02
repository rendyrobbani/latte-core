package com.rendyrobbani.latte.core.schema.tables;

import com.rendyrobbani.latte.core.domain.common.Table;
import com.rendyrobbani.latte.core.schema.tables.user.UserTable;

import java.util.ArrayList;
import java.util.List;

public final class DatabaseCoreTables {

	public DatabaseCoreTables() {
		throw new IllegalStateException("Singleton class");
	}

	private static List<Table> instance = null;

	public static List<Table> getInstance() {
		if (instance == null) {
			instance = new ArrayList<>();
			instance.add(UserTable.getInstance());
		}
		return instance;
	}

}