package com.rendyrobbani.latte.core.domain.data.user;

import com.rendyrobbani.espresso.common.data.person.PegawaiASN;
import com.rendyrobbani.latte.core.domain.base.Lockable;
import com.rendyrobbani.latte.core.domain.data.DataLog;

public interface DataUserLog extends DataLog<DataUser>, PegawaiASN, Lockable<DataUser> {

	String getPassword();

}