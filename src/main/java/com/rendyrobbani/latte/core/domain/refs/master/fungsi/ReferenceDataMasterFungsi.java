package com.rendyrobbani.latte.core.domain.refs.master.fungsi;

import com.rendyrobbani.latte.core.domain.data.master.fungsi.DataMasterFungsi;

public interface ReferenceDataMasterFungsi {

	DataMasterFungsi getFungsi();

	default String getFungsiId() {
		if (this.getFungsi() == null) return null;
		return this.getFungsi().getId();
	}

	default String getFungsiCode() {
		if (this.getFungsi() == null) return null;
		return this.getFungsi().getCode();
	}

	default String getFungsiName() {
		if (this.getFungsi() == null) return null;
		return this.getFungsi().getName();
	}

}