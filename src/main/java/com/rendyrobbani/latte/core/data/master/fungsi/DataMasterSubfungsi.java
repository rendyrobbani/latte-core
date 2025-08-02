package com.rendyrobbani.latte.core.data.master.fungsi;

import com.rendyrobbani.latte.core.data.Data;
import com.rendyrobbani.latte.core.data.master.fungsi.has.HasDataMasterFungsi;
import com.rendyrobbani.latte.core.domain.master.fungsi.Subfungsi;

public interface DataMasterSubfungsi extends Subfungsi, HasDataMasterFungsi, Data<String> {

	@Override
	default String getCode() {
		return this.getId();
	}

}