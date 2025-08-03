package com.rendyrobbani.latte.core.domain.data.user;

import com.rendyrobbani.espresso.common.data.person.PegawaiASN;
import com.rendyrobbani.latte.core.domain.base.Auditable;
import com.rendyrobbani.latte.core.domain.base.Lockable;

public interface DataUser extends PegawaiASN, Lockable<DataUser>, Auditable<DataUser> {

	String getId();

	String getPassword();

	@Override
	default String getNIP() {
		return this.getId();
	}

}