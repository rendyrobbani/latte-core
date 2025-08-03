package com.rendyrobbani.latte.core.domain.data;

import com.rendyrobbani.latte.core.domain.base.Loggable;
import com.rendyrobbani.latte.core.domain.data.user.DataUser;

public interface DataLog<Subject> extends Loggable<DataUser>, Data<Long> {

	Subject getSubject();

}