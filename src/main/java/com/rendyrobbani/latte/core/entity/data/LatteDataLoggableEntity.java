package com.rendyrobbani.latte.core.entity.data;

import com.rendyrobbani.latte.core.entity.data.user.DataUserEntity;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@MappedSuperclass
public abstract class LatteDataLoggableEntity<Subject> extends LatteDataReadableEntity {

	public abstract Subject getSubject();

	@Column(name = "logged_at", nullable = true)
	protected LocalDateTime loggedAt;

	@ManyToOne
	@JoinColumn(name = "logged_by", referencedColumnName = "id", nullable = true)
	protected DataUserEntity loggedBy;

	public LatteDataLoggableEntity(Subject subject, DataUserEntity loggedBy) {
		if (loggedBy == null) throw new IllegalArgumentException("loggedBy cannot be null");
		this.loggedAt = LocalDateTime.now();
		this.loggedBy = loggedBy;

		if (!(subject instanceof LatteDataReadableEntity)) throw new IllegalArgumentException("subject must be an instance of LatteDataReadableEntity");
		var s = (LatteDataReadableEntity) getSubject();
		this.createdAt = s.getCreatedAt();
		this.createdBy = s.getCreatedBy();
		this.updatedAt = s.getUpdatedAt();
		this.updatedBy = s.getUpdatedBy();
		this.isDeleted = s.isDeleted();
		this.deletedAt = s.getDeletedAt();
		this.deletedBy = s.getDeletedBy();
	}

}