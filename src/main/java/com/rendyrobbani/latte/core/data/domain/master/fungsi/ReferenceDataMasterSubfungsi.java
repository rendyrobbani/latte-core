package com.rendyrobbani.latte.core.data.domain.master.fungsi;

public interface ReferenceDataMasterSubfungsi {

	DataMasterSubfungsi getSubfungsi();

	default String getSubfungsiId() {
		if (this.getSubfungsi() == null) return null;
		return getSubfungsi().getId();
	}

	default String getSubfungsiCode() {
		if (this.getSubfungsi() == null) return null;
		return getSubfungsi().getCode();
	}

	default String getSubfungsiName() {
		if (this.getSubfungsi() == null) return null;
		return getSubfungsi().getName();
	}

	default String getSubfungsiName(boolean uppercase) {
		if (this.getSubfungsi() == null) return null;
		return getSubfungsi().getName(uppercase);
	}

}