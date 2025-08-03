package com.rendyrobbani.latte.core.entity.data.master.fungsi;

import com.rendyrobbani.espresso.common.impl.classify.fungsi.FungsiClassificationLevelImpl;
import com.rendyrobbani.espresso.factory.classify.fungsi.FungsiClassificationFactory;
import com.rendyrobbani.latte.core.domain.refs.master.fungsi.ReferenceDataMasterSubfungsi;
import com.rendyrobbani.latte.core.entity.data.AbstractDataReadableEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@MappedSuperclass
public abstract class AbstractDataMasterSubfungsiEntity extends AbstractDataReadableEntity implements ReferenceDataMasterSubfungsi {

	@Id
	@Column(name = "id", nullable = false, length = 5)
	protected String id;

	@Column(name = "id", nullable = false, length = 2)
	protected String fungsiId;

	@Column(name = "name", nullable = false, length = 255)
	protected String name;

	@Column(name = "is_enabled", nullable = false, length = 255)
	protected boolean isEnabled;

	public boolean isDisabled() {
		return !this.isEnabled;
	}

	public AbstractDataMasterSubfungsiEntity(String code, String name) {
		super();
		var classification = FungsiClassificationFactory.classify(code);
		if (classification == null) throw new IllegalArgumentException("Invalid code");
		if (!classification.getLevel().equals(FungsiClassificationLevelImpl.SUBFUNGSI)) throw new IllegalArgumentException("Invalid code");
		this.fungsiId = classification.getFungsiCode();
		this.id = classification.getSubfungsiCode();
		this.name = name;
		this.isEnabled = false;
	}

}