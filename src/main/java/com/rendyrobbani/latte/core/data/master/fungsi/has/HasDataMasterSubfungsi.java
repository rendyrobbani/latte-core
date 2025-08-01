package com.rendyrobbani.latte.core.data.master.fungsi.has;

import com.rendyrobbani.latte.core.data.master.fungsi.DataMasterSubfungsi;
import com.rendyrobbani.latte.core.domain.master.fungsi.has.HasSubfungsi;

public interface HasDataMasterSubfungsi extends HasSubfungsi {

	DataMasterSubfungsi getSubfungsi();

	default String getSubfungsiId() {
		if (this.getSubfungsi() == null) return null;
		return this.getSubfungsi().getId();
	}

	@Override
	default String getSubfungsiCode() {
		if (this.getSubfungsi() == null) return null;
		return this.getSubfungsi().getId();
	}

	@Override
	default String getSubfungsiPart() {
		if (this.getSubfungsi() == null) return null;
		return this.getSubfungsi().getPart();
	}

	default String getSubfungsiName(boolean uppercase, boolean nullable) {
		if (this.getSubfungsi() == null) return null;
		return this.getSubfungsi().getName(uppercase, nullable);
	}

	default String getSubfungsiName(boolean uppercase) {
		if (this.getSubfungsi() == null) return null;
		return this.getSubfungsi().getName(uppercase);
	}

	default String getSubfungsiName() {
		if (this.getSubfungsi() == null) return null;
		return this.getSubfungsi().getName();
	}

}