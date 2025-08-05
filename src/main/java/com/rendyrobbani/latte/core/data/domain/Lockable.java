package com.rendyrobbani.latte.core.data.domain;

import java.time.LocalDateTime;

public interface Lockable {

	boolean isLocked();

	LocalDateTime getLockedAt();

	String getLockedBy();

	void lock(String lockedBy);

	void unlock(String unlockedBy);

}