package com.rendyrobbani.latte.core.domain.base;

import java.time.LocalDateTime;

public interface Loggable<User> {

	LocalDateTime getLoggedAt();

	User getLoggedBy();

}