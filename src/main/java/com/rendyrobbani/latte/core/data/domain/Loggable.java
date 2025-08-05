package com.rendyrobbani.latte.core.data.domain;

import com.rendyrobbani.espresso.identify.NIP;

import java.time.LocalDateTime;

public interface Loggable<Subject> {

	Subject getSubject();

	LocalDateTime getLoggedAt();

	NIP getLoggedBy();

}