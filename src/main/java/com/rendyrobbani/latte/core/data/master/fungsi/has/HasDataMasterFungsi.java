package com.rendyrobbani.latte.core.data.master.fungsi.has;

import com.rendyrobbani.latte.core.data.master.fungsi.DataMasterFungsi;
import com.rendyrobbani.latte.core.domain.master.fungsi.has.HasFungsi;

public interface HasDataMasterFungsi extends HasFungsi {

	DataMasterFungsi getFungsi();

	default String getFungsiId() {
		if (this.getFungsi() == null) return null;
		return this.getFungsi().getId();
	}

	@Override
	default String getFungsiCode() {
		if (this.getFungsi() == null) return null;
		return this.getFungsi().getId();
	}

	@Override
	default String getFungsiPart() {
		if (this.getFungsi() == null) return null;
		return this.getFungsi().getPart();
	}

	default String getFungsiName(boolean uppercase, boolean nullable) {
		if (this.getFungsi() == null) return null;
		return this.getFungsi().getName(uppercase, nullable);
	}

	default String getFungsiName(boolean uppercase) {
		if (this.getFungsi() == null) return null;
		return this.getFungsi().getName(uppercase);
	}

	default String getFungsiName() {
		if (this.getFungsi() == null) return null;
		return this.getFungsi().getName();
	}

}