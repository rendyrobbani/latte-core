package com.rendyrobbani.latte.core.domain.data.user;

import com.rendyrobbani.espresso.common.data.pegawai.PegawaiASN;

public interface DataUser extends PegawaiASN {

	String getId();

	String getPassword();

	@Override
	default String getNIP() {
		return this.getId();
	}

}