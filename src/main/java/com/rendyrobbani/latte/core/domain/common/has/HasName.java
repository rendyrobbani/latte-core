package com.rendyrobbani.latte.core.domain.common.has;

public interface HasName {

	String getName();

	default String getName(boolean uppercase, boolean nullable) {
		if (this.getName() == null && nullable) return null;
		if (this.getName() == null) return "";

		return uppercase ? this.getName().toUpperCase() : this.getName();
	}

	default String getName(boolean uppercase) {
		return this.getName(uppercase, true);
	}

}