package com.rendyrobbani.latte.core.domain.base;

import java.time.LocalDateTime;

public interface Auditable<User> {

	LocalDateTime getCreatedAt();

	User getCreatedBy();

	LocalDateTime getUpdatedAt();

	User getUpdatedBy();

	boolean isDeleted();

	LocalDateTime getDeletedAt();

	User getDeletedBy();

	void update(LocalDateTime updatedAt, User updatedBy);

	void delete(LocalDateTime deletedAt, User deletedBy);

	void restore(LocalDateTime restoredAt, User restoredBy);

}