package com.rendyrobbani.latte.core.converter.gender;

import com.rendyrobbani.espresso.common.data.gender.Gender;
import com.rendyrobbani.espresso.common.impl.gender.GenderImpl;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class GenderConverter implements AttributeConverter<Gender, Integer> {

	@Override
	public Integer convertToDatabaseColumn(Gender gender) {
		if (gender == null) return null;
		return gender.getValue();
	}

	@Override
	public Gender convertToEntityAttribute(Integer value) {
		if (value == null) return null;
		return GenderImpl.fromValue(value);
	}

}