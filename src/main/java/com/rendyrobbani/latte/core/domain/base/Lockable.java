package com.rendyrobbani.latte.core.domain.base;

import java.time.LocalDateTime;

public interface Lockable<User> {

	boolean isLocked();

	LocalDateTime getLockedAt();

	User getLockedBy();

	void lock(LocalDateTime lockedAt, User lockedBy);

	void unlock(LocalDateTime unlockedAt, User unlockedBy);

}