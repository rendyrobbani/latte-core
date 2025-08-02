package com.rendyrobbani.latte.core.schema.tables;

import com.rendyrobbani.latte.core.domain.common.Column;
import com.rendyrobbani.latte.core.domain.common.Table;
import com.rendyrobbani.latte.core.domain.common.contraint.ForeignKey;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
public final class DatabaseForeignKey implements ForeignKey {

	private final Integer order;

	private final Table fromTable;

	private final List<Column> fromColumns;

	private final Table intoTable;

	private final List<Column> intoColumns;

}