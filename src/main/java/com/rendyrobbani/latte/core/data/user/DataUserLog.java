package com.rendyrobbani.latte.core.data.user;

import com.rendyrobbani.latte.core.data.DataLog;
import com.rendyrobbani.latte.core.domain.common.Authentication;
import com.rendyrobbani.latte.core.domain.common.Pegawai;

public interface DataUserLog extends Pegawai, Authentication, DataLog<DataUser> {

	@Override
	default String getNIP() {
		return this.getSubject().getId();
	}

	@Override
	default String getUsername() {
		return this.getSubject().getId();
	}

}