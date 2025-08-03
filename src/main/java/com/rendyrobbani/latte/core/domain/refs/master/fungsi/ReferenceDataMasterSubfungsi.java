package com.rendyrobbani.latte.core.domain.refs.master.fungsi;

import com.rendyrobbani.latte.core.domain.data.master.fungsi.DataMasterSubfungsi;

public interface ReferenceDataMasterSubfungsi {

	DataMasterSubfungsi getSubfungsi();

	default String getSubfungsiId() {
		if (this.getSubfungsi() == null) return null;
		return this.getSubfungsi().getId();
	}

	default String getSubfungsiCode() {
		if (this.getSubfungsi() == null) return null;
		return this.getSubfungsi().getCode();
	}

	default String getSubfungsiName() {
		if (this.getSubfungsi() == null) return null;
		return this.getSubfungsi().getName();
	}

}