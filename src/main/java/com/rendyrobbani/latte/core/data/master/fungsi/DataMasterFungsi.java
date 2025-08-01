package com.rendyrobbani.latte.core.data.master.fungsi;

import com.rendyrobbani.latte.core.data.Data;
import com.rendyrobbani.latte.core.domain.master.fungsi.Fungsi;

public interface DataMasterFungsi extends Fungsi, Data<String> {

	@Override
	default String getId() {
		return this.getCode();
	}

}