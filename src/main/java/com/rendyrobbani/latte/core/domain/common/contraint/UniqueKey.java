package com.rendyrobbani.latte.core.domain.common.contraint;

import com.rendyrobbani.latte.core.domain.common.Column;
import com.rendyrobbani.latte.core.domain.common.Table;

import java.util.List;

public interface UniqueKey {

	Table getTable();

	List<Column> getColumns();

}