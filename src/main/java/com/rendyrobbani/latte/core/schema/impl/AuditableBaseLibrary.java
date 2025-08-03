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
public final class AuditableBaseLibrary implements BaseLibrary {

	private final List<Column> columns;

	private AuditableBaseLibrary() {
		this.columns = new ArrayList<>();
		this.columns.add(DateTimeColumnFactory.create("created_at", true));
		this.columns.add(NIPColumnFactory.create("created_by", true));
		this.columns.add(DateTimeColumnFactory.create("updated_at", true));
		this.columns.add(NIPColumnFactory.create("updated_by", true));
		this.columns.add(BooleanColumnFactory.create("is_deleted", false));
		this.columns.add(DateTimeColumnFactory.create("deleted_at", true));
		this.columns.add(NIPColumnFactory.create("deleted_by", true));
	}

	private static AuditableBaseLibrary instance;

	public static AuditableBaseLibrary getInstance() {
		if (instance == null) instance = new AuditableBaseLibrary();
		return instance;
	}

}