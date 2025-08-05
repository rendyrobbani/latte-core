package com.rendyrobbani.latte.core.data.domain.master;

public interface DataMasterClassification extends DataMaster<String> {

	default String getCode() {
		return this.getId();
	}

}