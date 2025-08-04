package com.rendyrobbani.latte.core.data.domain.master;

import com.rendyrobbani.latte.core.data.domain.Lockable;
import com.rendyrobbani.latte.core.data.domain.user.DataUser;

public interface DataMaster<Target, ID> extends Lockable<DataUser, Target> {

	ID getId();

	String getName();

	default String getName(boolean uppercase) {
		if (this.getName() == null) return null;
		if (uppercase) return this.getName().toUpperCase();
		return this.getName();
	}

}