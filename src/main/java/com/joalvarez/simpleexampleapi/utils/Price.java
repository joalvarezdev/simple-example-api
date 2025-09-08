package com.joalvarez.simpleexampleapi.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Price {

	private final BigDecimal value;

	private Price(BigDecimal value) {
		this.value = value;
	}

	public static Integer fromDisplay(double displayValue) {
		return BigDecimal.valueOf(100).multiply(BigDecimal.valueOf(displayValue).setScale(2, RoundingMode.HALF_UP)).intValue();
	}

	public static Double toDatabase(int databaseValue) {
		return BigDecimal.valueOf(databaseValue).divide(BigDecimal.valueOf(100)).setScale(2, RoundingMode.HALF_UP).doubleValue();
	}
}
