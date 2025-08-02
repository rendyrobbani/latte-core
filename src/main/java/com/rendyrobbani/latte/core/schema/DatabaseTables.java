package com.rendyrobbani.latte.core.schema;

import com.rendyrobbani.latte.core.domain.common.Table;
import com.rendyrobbani.latte.core.schema.tables.DatabaseCoreTables;

import java.util.ArrayList;
import java.util.List;

public final class DatabaseTables {

	public DatabaseTables() {
		throw new IllegalStateException("Singleton class");
	}

	private static List<Table> instance = null;

	public static List<Table> getInstance() {
		if (instance == null) {
			instance = new ArrayList<>();
			instance.addAll(DatabaseCoreTables.getInstance());
		}
		return instance;
	}

}