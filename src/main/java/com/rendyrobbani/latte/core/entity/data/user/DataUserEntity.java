package com.rendyrobbani.latte.core.entity.data.user;

import com.rendyrobbani.espresso.common.data.gender.Gender;
import com.rendyrobbani.espresso.common.data.pangkat.PangkatASN;
import com.rendyrobbani.latte.core.converter.gender.GenderConverter;
import com.rendyrobbani.latte.core.converter.pangkat.PangkatASNConverter;
import com.rendyrobbani.latte.core.domain.data.user.DataUser;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "data_user")
public class DataUserEntity implements DataUser, Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", nullable = false, length = 18)
	private String id;

	@Convert(converter = PangkatASNConverter.class)
	@Column(name = "pangkat", nullable = false, length = 2)
	private PangkatASN pangkat;

	@Setter
	@Column(name = "name", nullable = false, length = 255)
	private String name;

	@Setter
	@Column(name = "title_prefix", nullable = true, length = 255)
	private String titlePrefix;

	@Setter
	@Column(name = "title_suffix", nullable = true, length = 255)
	private String titleSuffix;

	@Setter
	@Column(name = "password", nullable = false, length = 255)
	private String password;

	@Column(name = "birth_date", nullable = false)
	private LocalDate birthDate;

	@Column(name = "start_date", nullable = true)
	private LocalDate startDate;

	@Convert(converter = GenderConverter.class)
	@Column(name = "gender", nullable = false)
	private Gender gender;

	@Column(name = "number", nullable = false)
	private Integer number;

	@Column(name = "is_pns", nullable = false)
	private boolean isPNS;

	@Column(name = "is_p3k", nullable = false)
	private boolean isP3K;

	@Column(name = "is_locked", nullable = false)
	private boolean isLocked;

	@Column(name = "locked_at", nullable = true)
	private LocalDateTime lockedAt;

	@ManyToOne
	@JoinColumn(name = "locked_by", referencedColumnName = "id", nullable = true)
	private DataUserEntity lockedBy;

	@Column(name = "created_at", nullable = true)
	private LocalDateTime createdAt;

	@ManyToOne
	@JoinColumn(name = "created_by", referencedColumnName = "id", nullable = true)
	private DataUserEntity createdBy;

	@Column(name = "updated_at", nullable = true)
	private LocalDateTime updatedAt;

	@ManyToOne
	@JoinColumn(name = "updated_by", referencedColumnName = "id", nullable = true)
	private DataUserEntity updatedBy;

	@Column(name = "is_deleted", nullable = false)
	private boolean isDeleted;

	@Column(name = "deleted_at", nullable = true)
	private LocalDateTime deletedAt;

	@ManyToOne
	@JoinColumn(name = "deleted_by", referencedColumnName = "id", nullable = true)
	private DataUserEntity deletedBy;

	public DataUserEntity(String id, DataUserEntity createdBy) {
		if (id == null) throw new IllegalArgumentException("id cannot be null");
		if (id.isBlank()) throw new IllegalArgumentException("id cannot be blank");
		if (!id.matches(REGEX)) throw new IllegalArgumentException("id is not valid");

		this.id = id;
		this.createdAt = LocalDateTime.now();
		this.createdBy = createdBy;

		this.birthDate = DataUser.super.getBirthDate();
		this.startDate = DataUser.super.getStartDate();
		this.gender = DataUser.super.getGender();
		this.number = DataUser.super.getNumber();
	}

	public void setPangkat(PangkatASN pangkat) {
		if (pangkat == null) throw new IllegalArgumentException("pangkat cannot be null");
		this.pangkat = pangkat;
		this.isPNS = pangkat.isPNS();
		this.isP3K = pangkat.isP3K();
	}

	public void setStartDate(LocalDate startDate) {
		if (startDate == null) throw new IllegalArgumentException("startDate cannot be null");
		if (this.pangkat == null) throw new IllegalArgumentException("must set pangkat before");
		if (this.pangkat.isPNS()) return;
		this.startDate = startDate;
	}

	public DataUserEntity lock(DataUserEntity lockedBy) {
		if (lockedBy == null) throw new IllegalArgumentException("lockedBy cannot be null");
		this.isLocked = true;
		this.lockedAt = LocalDateTime.now();
		this.lockedBy = lockedBy;
		return this;
	}

	public DataUserEntity unlock(DataUserEntity unlockedBy) {
		if (unlockedBy == null) throw new IllegalArgumentException("unlockedBy cannot be null");
		this.isLocked = true;
		this.lockedAt = null;
		this.lockedBy = null;
		this.updatedAt = LocalDateTime.now();
		this.updatedBy = unlockedBy;
		return this;
	}

	public DataUserEntity update(DataUserEntity updatedBy) {
		if (updatedBy == null) throw new IllegalArgumentException("updatedBy cannot be null");
		this.updatedAt = LocalDateTime.now();
		this.updatedBy = updatedBy;
		return this;
	}

	public DataUserEntity delete(DataUserEntity deletedBy) {
		if (deletedBy == null) throw new IllegalArgumentException("deletedBy cannot be null");
		this.isDeleted = true;
		this.deletedAt = LocalDateTime.now();
		this.deletedBy = deletedBy;
		return this;
	}

	public DataUserEntity restore(DataUserEntity restoredBy) {
		if (restoredBy == null) throw new IllegalArgumentException("restoredBy cannot be null");
		this.isDeleted = false;
		this.deletedAt = null;
		this.deletedBy = null;
		this.updatedAt = LocalDateTime.now();
		this.updatedBy = restoredBy;
		return this;
	}

}