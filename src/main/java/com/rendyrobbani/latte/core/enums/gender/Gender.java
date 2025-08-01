package com.rendyrobbani.latte.core.enums.gender;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Gender {
	MALE(1, "Laki-laki"),
	FEMALE(2, "Perempuan");

	private final Integer value;

	private final String title;

	public static Gender fromValue(Integer value) {
		if (value == null) return null;
		for (var e : values()) if (e.getValue().equals(value)) return e;
		return null;
	}

	public static Gender fromValue(String value) {
		if (value.matches("^([12])$")) return fromValue(Integer.parseInt(value));
		return null;
	}
}