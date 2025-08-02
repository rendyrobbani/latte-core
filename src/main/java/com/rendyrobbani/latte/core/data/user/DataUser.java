package com.rendyrobbani.latte.core.data.user;

import com.rendyrobbani.latte.core.data.Data;
import com.rendyrobbani.latte.core.domain.common.Authentication;
import com.rendyrobbani.latte.core.domain.common.Pegawai;

public interface DataUser extends Pegawai, Authentication, Data<String> {

	@Override
	default String getNIP() {
		return this.getId();
	}

	@Override
	default String getUsername() {
		return this.getId();
	}

}