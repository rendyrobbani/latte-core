package com.rendyrobbani.latte.core.data.domain;

import java.time.LocalDateTime;

public interface Lockable<User, Target> {

	boolean isLocked();

	LocalDateTime getLockedAt();

	User getLockedBy();

	Target lock(User lockedBy);

	Target unlock(User unlockedBy);

}