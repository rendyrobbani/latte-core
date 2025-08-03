package com.rendyrobbani.latte.core.entity.data.user.log;

import com.rendyrobbani.espresso.common.data.gender.Gender;
import com.rendyrobbani.espresso.common.data.pangkat.PangkatASN;
import com.rendyrobbani.latte.core.converter.gender.GenderConverter;
import com.rendyrobbani.latte.core.converter.pangkat.PangkatASNConverter;
import com.rendyrobbani.latte.core.entity.data.LatteDataReadableEntity;
import com.rendyrobbani.latte.core.entity.data.user.DataUserEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class DataUserLogEntity extends LatteDataReadableEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "subject_id", referencedColumnName = "id", nullable = false)
	protected DataUserEntity subject;

	@Convert(converter = PangkatASNConverter.class)
	@Column(name = "pangkat", nullable = false, length = 2)
	protected PangkatASN pangkat;

	@Column(name = "name", nullable = false, length = 255)
	protected String name;

	@Column(name = "title_prefix", nullable = true, length = 255)
	protected String titlePrefix;

	@Column(name = "title_suffix", nullable = true, length = 255)
	protected String titleSuffix;

	@Column(name = "password", nullable = false, length = 255)
	protected String password;

	@Column(name = "birth_date", nullable = false)
	protected LocalDate birthDate;

	@Column(name = "start_date", nullable = true)
	protected LocalDate startDate;

	@Convert(converter = GenderConverter.class)
	@Column(name = "gender", nullable = false)
	protected Gender gender;

	@Column(name = "number", nullable = false)
	protected Integer number;

	@Column(name = "is_pns", nullable = false)
	protected boolean isPNS;

	@Column(name = "is_p3k", nullable = false)
	protected boolean isP3K;

	@Column(name = "is_locked", nullable = false)
	protected boolean isLocked;

	@Column(name = "locked_at", nullable = true)
	protected LocalDateTime lockedAt;

	@ManyToOne
	@JoinColumn(name = "locked_by", referencedColumnName = "id", nullable = true)
	protected DataUserEntity lockedBy;

	@Column(name = "logged_at", nullable = true)
	protected LocalDateTime loggedAt;

	@ManyToOne
	@JoinColumn(name = "logged_by", referencedColumnName = "id", nullable = true)
	protected DataUserEntity loggedBy;

	public DataUserLogEntity(DataUserEntity subject, DataUserEntity loggedBy) {
		super(subject.getCreatedAt(), subject.getCreatedBy(), subject.getUpdatedAt(), subject.getUpdatedBy(), subject.isDeleted(), subject.getDeletedAt(), subject.getDeletedBy());
		this.subject = subject;
		this.loggedAt = LocalDateTime.now();
		this.loggedBy = loggedBy;
	}

}