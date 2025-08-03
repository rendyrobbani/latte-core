package com.rendyrobbani.latte.core.domain.data;

import com.rendyrobbani.latte.core.domain.base.Auditable;
import com.rendyrobbani.latte.core.domain.data.user.DataUser;

public interface Data<ID> extends Auditable<DataUser> {

	ID getId();

}