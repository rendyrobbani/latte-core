package com.rendyrobbani.latte.core.domain.common.has;

import com.rendyrobbani.latte.core.enums.pangkat.Pangkat;

public interface HasPangkat {

	Pangkat getPangkat();

	default String getPangkatValue() {
		if (this.getPangkat() == null) return null;
		return this.getPangkat().getValue();
	}

	default String getPangkatTitle() {
		if (this.getPangkat() == null) return null;
		return this.getPangkat().getTitle();
	}

}