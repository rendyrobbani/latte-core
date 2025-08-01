package com.rendyrobbani.latte.core.data.user;

import com.rendyrobbani.latte.core.data.DataLog;
import com.rendyrobbani.latte.core.domain.common.Authentication;
import com.rendyrobbani.latte.core.domain.common.Pegawai;

public interface DataUserLog extends Pegawai, Authentication, DataLog<DataUser> {

}