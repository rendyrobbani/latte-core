package com.rendyrobbani.latte.core.data.domain;

import com.rendyrobbani.espresso.identify.NIP;

import java.time.LocalDateTime;

public interface Readable {

	LocalDateTime getCreatedAt();

	NIP getCreatedBy();

	LocalDateTime getUpdatedAt();

	NIP getUpdatedBy();

	boolean isDeleted();

	LocalDateTime getDeletedAt();

	NIP getDeletedBy();

}