package com.rendyrobbani.latte.core.converter.pangkat;

import com.rendyrobbani.espresso.common.data.pangkat.PangkatASN;
import com.rendyrobbani.espresso.common.impl.pangkat.PangkatP3K;
import com.rendyrobbani.espresso.common.impl.pangkat.PangkatPNS;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class PangkatASNConverter implements AttributeConverter<PangkatASN, String> {

	@Override
	public String convertToDatabaseColumn(PangkatASN pangkatASN) {
		if (pangkatASN == null) return null;
		return pangkatASN.getValue();
	}

	@Override
	public PangkatASN convertToEntityAttribute(String value) {
		PangkatASN pangkatASN;
		pangkatASN = PangkatPNS.fromValue(value);
		pangkatASN = pangkatASN != null ? pangkatASN : PangkatP3K.fromValue(value);
		return pangkatASN;
	}

}