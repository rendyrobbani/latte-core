package com.rendyrobbani.latte.core.schema;

import com.rendyrobbani.latte.core.domain.common.Column;
import com.rendyrobbani.latte.core.domain.common.Table;
import lombok.Getter;

import java.util.List;

@Getter
public final class DatabaseTable implements Table {

	private final String name;

	private final String nameForData;

	private final String nameForEntity;

	private final String nameForRepository;

	private final List<Column> columns;

	public DatabaseTable(String name, List<Column> columns) {
		if (name == null) throw new IllegalArgumentException("Name cannot be null");
		if (columns == null) throw new IllegalArgumentException("Columns cannot be null");
		if (columns.isEmpty()) throw new IllegalArgumentException("Columns cannot be empty");

		this.name = name;
		this.nameForData = Table.super.getNameForData();
		this.nameForEntity = Table.super.getNameForEntity();
		this.nameForRepository = Table.super.getNameForRepository();
		this.columns = columns;
	}

}