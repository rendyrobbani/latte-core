package com.rendyrobbani.latte.core.data.domain.master;

public interface DataMasterClassification<Target> extends DataMaster<Target, String> {

	default String getCode() {
		return this.getId();
	}

}