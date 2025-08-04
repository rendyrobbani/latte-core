package com.rendyrobbani.latte.core.data.domain;

import java.time.LocalDateTime;

public interface Loggable<User, Subject> {

	Subject getSubject();

	LocalDateTime getLoggedAt();

	User getLoggedBy();

}