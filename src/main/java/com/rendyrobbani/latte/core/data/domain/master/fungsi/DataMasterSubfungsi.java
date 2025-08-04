package com.rendyrobbani.latte.core.data.domain.master.fungsi;

import com.rendyrobbani.latte.core.data.domain.Lockable;
import com.rendyrobbani.latte.core.data.domain.Writable;
import com.rendyrobbani.latte.core.data.domain.master.DataMasterClassification;
import com.rendyrobbani.latte.core.data.domain.user.DataUser;

public interface DataMasterSubfungsi extends ReferenceDataMasterFungsi, DataMasterClassification<DataMasterSubfungsi>, Writable<DataUser, DataMasterSubfungsi>, Lockable<DataUser, DataMasterSubfungsi> {

}