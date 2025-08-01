package com.rendyrobbani.latte.core.domain.common;

import java.util.ArrayList;

public interface Personal {

	String getTitlePrefix();

	String getTitleSuffix();

	String getNickName();

	default String getNickName(boolean uppercase, boolean nullable) {
		if (this.getNickName() == null && nullable) return null;
		if (this.getNickName() == null) return "";
		if (uppercase) return this.getNickName().toUpperCase().replace("HJ.", "Hj.");
		return this.getNickName();
	}

	default String getNickName(boolean uppercase) {
		return this.getNickName(uppercase, true);
	}

	String getFullName();

	default String getFullName(boolean uppercase, boolean nullable) {
		if (this.getNickName() == null && nullable) return null;
		if (this.getNickName() == null) return "";
		var fullName = new ArrayList<String>();
		if (this.getTitlePrefix() != null) fullName.add(this.getTitlePrefix() + " ");
		fullName.add(this.getNickName(uppercase));
		if (this.getTitleSuffix() != null) fullName.add(", " + this.getTitleSuffix());
		return String.join("", fullName);
	}

	default String getFullName(boolean uppercase) {
		return this.getFullName(uppercase, true);
	}

}