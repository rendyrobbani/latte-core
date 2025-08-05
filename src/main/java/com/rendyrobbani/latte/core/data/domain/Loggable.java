package com.rendyrobbani.latte.core.data.domain;

import java.time.LocalDateTime;

public interface Loggable<Subject> {

	Subject getSubject();

	LocalDateTime getLoggedAt();

	String getLoggedBy();

}