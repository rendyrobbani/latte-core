package com.rendyrobbani.latte.core.data.domain;

import java.time.LocalDateTime;

public interface Readable {

	LocalDateTime getCreatedAt();

	String getCreatedBy();

	LocalDateTime getUpdatedAt();

	String getUpdatedBy();

	boolean isDeleted();

	LocalDateTime getDeletedAt();

	String getDeletedBy();

}