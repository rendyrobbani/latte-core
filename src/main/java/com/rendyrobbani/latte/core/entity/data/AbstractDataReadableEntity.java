package com.rendyrobbani.latte.core.entity.data;

import com.rendyrobbani.latte.core.entity.AbstractEntity;
import com.rendyrobbani.latte.core.entity.data.user.DataUserEntity;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public abstract class AbstractDataReadableEntity extends AbstractEntity {

	@Column(name = "created_at", nullable = true)
	protected LocalDateTime createdAt;

	@ManyToOne
	@JoinColumn(name = "created_by", referencedColumnName = "id", nullable = true)
	protected DataUserEntity createdBy;

	@Column(name = "updated_at", nullable = true)
	protected LocalDateTime updatedAt;

	@ManyToOne
	@JoinColumn(name = "updated_by", referencedColumnName = "id", nullable = true)
	protected DataUserEntity updatedBy;

	@Column(name = "is_deleted", nullable = false)
	protected boolean isDeleted;

	@Column(name = "deleted_at", nullable = true)
	protected LocalDateTime deletedAt;

	@ManyToOne
	@JoinColumn(name = "deleted_by", referencedColumnName = "id", nullable = true)
	protected DataUserEntity deletedBy;

	public AbstractDataReadableEntity(AbstractDataReadableEntity entity) {
		this.createdAt = entity.getCreatedAt();
		this.createdBy = entity.getCreatedBy();
		this.updatedAt = entity.getUpdatedAt();
		this.updatedBy = entity.getUpdatedBy();
		this.isDeleted = entity.isDeleted();
		this.deletedAt = entity.getDeletedAt();
		this.deletedBy = entity.getDeletedBy();
	}

}