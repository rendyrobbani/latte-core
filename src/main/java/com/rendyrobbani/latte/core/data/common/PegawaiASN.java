package com.rendyrobbani.latte.core.data.common;

import com.rendyrobbani.espresso.identify.Gender;
import com.rendyrobbani.espresso.identify.NIP;
import com.rendyrobbani.espresso.identify.PangkatASN;

public interface PegawaiASN extends Pegawai {

	NIP getNIP();

	PangkatASN getPangkat();

	Gender getGender();

	Integer getNumber();

	default boolean isPNS() {
		if (this.getPangkat() == null) return false;
		return this.getPangkat().isPNS();
	}

	default boolean isP3K() {
		if (this.getPangkat() == null) return false;
		return this.getPangkat().isP3K();
	}

}