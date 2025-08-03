package com.rendyrobbani.latte.core.entity.data;

import com.rendyrobbani.latte.core.entity.data.user.DataUserEntity;
import jakarta.persistence.MappedSuperclass;

import java.time.LocalDateTime;

@MappedSuperclass
@SuppressWarnings("unchecked")
public abstract class LatteDataWritableEntity<Entity> extends LatteDataReadableEntity {

	public Entity update(DataUserEntity updatedBy) {
		if (updatedBy == null) throw new IllegalArgumentException("updatedBy cannot be null");
		this.updatedAt = LocalDateTime.now();
		this.updatedBy = updatedBy;
		return (Entity) this;
	}

	public Entity delete(DataUserEntity deletedBy) {
		if (deletedBy == null) throw new IllegalArgumentException("deletedBy cannot be null");
		this.isDeleted = true;
		this.deletedAt = LocalDateTime.now();
		this.deletedBy = deletedBy;
		return (Entity) this;
	}

	public Entity restore(DataUserEntity restoredBy) {
		if (restoredBy == null) throw new IllegalArgumentException("restoredBy cannot be null");
		this.isDeleted = false;
		this.deletedAt = null;
		this.deletedBy = null;
		this.updatedAt = LocalDateTime.now();
		this.updatedBy = restoredBy;
		return (Entity) this;
	}

}