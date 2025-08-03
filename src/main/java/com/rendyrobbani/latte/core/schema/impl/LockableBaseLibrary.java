package com.rendyrobbani.latte.core.schema.impl;

import com.rendyrobbani.espresso.schema.base.Column;
import com.rendyrobbani.espresso.schema.fact.column.common.BooleanColumnFactory;
import com.rendyrobbani.espresso.schema.fact.column.common.DateTimeColumnFactory;
import com.rendyrobbani.espresso.schema.fact.column.special.NIPColumnFactory;
import com.rendyrobbani.latte.core.schema.base.BaseLibrary;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public final class LockableBaseLibrary implements BaseLibrary {

	private final List<Column> columns;

	private LockableBaseLibrary() {
		this.columns = new ArrayList<>();
		this.columns.add(BooleanColumnFactory.create("is_locked", false));
		this.columns.add(DateTimeColumnFactory.create("locked_at", true));
		this.columns.add(NIPColumnFactory.create("locked_by", true));
	}

	private static LockableBaseLibrary instance;

	public static LockableBaseLibrary getInstance() {
		if (instance == null) instance = new LockableBaseLibrary();
		return instance;
	}

}