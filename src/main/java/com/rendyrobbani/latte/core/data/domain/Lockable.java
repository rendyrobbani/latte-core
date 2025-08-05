package com.rendyrobbani.latte.core.data.domain;

import com.rendyrobbani.espresso.identify.NIP;

import java.time.LocalDateTime;

public interface Lockable {

	boolean isLocked();

	LocalDateTime getLockedAt();

	NIP getLockedBy();

	void lock(NIP lockedBy);

	void unlock(NIP unlockedBy);

}