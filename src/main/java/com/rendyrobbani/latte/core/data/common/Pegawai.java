package com.rendyrobbani.latte.core.data.common;

import com.rendyrobbani.espresso.identify.NameAndTitle;

import java.time.LocalDate;

public interface Pegawai extends NameAndTitle {

	LocalDate getBirthDate();

	LocalDate getStartDate();

}