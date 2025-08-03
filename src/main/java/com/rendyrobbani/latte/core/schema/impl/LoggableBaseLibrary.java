package com.rendyrobbani.latte.core.schema.impl;

import com.rendyrobbani.espresso.schema.base.Column;
import com.rendyrobbani.espresso.schema.fact.column.common.DateTimeColumnFactory;
import com.rendyrobbani.espresso.schema.fact.column.special.NIPColumnFactory;
import com.rendyrobbani.latte.core.schema.base.BaseLibrary;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public final class LoggableBaseLibrary implements BaseLibrary {

	private final List<Column> columns;

	private LoggableBaseLibrary() {
		this.columns = new ArrayList<>();
		this.columns.add(DateTimeColumnFactory.create("logged_at", true));
		this.columns.add(NIPColumnFactory.create("logged_by", true));
	}

	private static LoggableBaseLibrary instance;

	public static LoggableBaseLibrary getInstance() {
		if (instance == null) instance = new LoggableBaseLibrary();
		return instance;
	}

}