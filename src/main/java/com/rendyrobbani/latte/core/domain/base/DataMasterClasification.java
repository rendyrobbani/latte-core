package com.rendyrobbani.latte.core.domain.base;

public interface DataMasterClasification extends Clasification<String> {

	@Override
	default String getCode() {
		return this.getId();
	}

}