package com.rendyrobbani.latte.core.data.domain.user;

import com.rendyrobbani.latte.core.data.common.PegawaiASN;
import com.rendyrobbani.latte.core.data.domain.Lockable;
import com.rendyrobbani.latte.core.data.domain.Writable;

public interface DataUser extends PegawaiASN, Writable, Lockable {

	String getPassword();

}