package com.rendyrobbani.latte.core.data.domain.master.fungsi;

public interface ReferenceDataMasterFungsi {

	DataMasterFungsi getFungsi();

	default String getFungsiId() {
		if (this.getFungsi() == null) return null;
		return getFungsi().getId();
	}

	default String getFungsiCode() {
		if (this.getFungsi() == null) return null;
		return getFungsi().getCode();
	}

	default String getFungsiName() {
		if (this.getFungsi() == null) return null;
		return getFungsi().getName();
	}

	default String getFungsiName(boolean uppercase) {
		if (this.getFungsi() == null) return null;
		return getFungsi().getName(uppercase);
	}

}