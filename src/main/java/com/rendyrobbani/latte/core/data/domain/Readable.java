package com.rendyrobbani.latte.core.data.domain;

import java.time.LocalDateTime;

public interface Readable<User> {

	LocalDateTime getCreatedAt();

	User getCreatedBy();

	LocalDateTime getUpdatedAt();

	User getUpdatedBy();

	boolean isDeleted();

	LocalDateTime getDeletedAt();

	User getDeletedBy();

}