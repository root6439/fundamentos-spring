package com.fundamentos.enums;

public enum DurationEnum {

	HALF_HOUR(1, "Half hour"), 
	ONE_HOUR(2, "One hour"), 
	HALF_DAY(3, "Half day"), 
	FULL_DAY(4, "Full day");

	private int cod;
	private String description;

	private DurationEnum(int cod, String description) {
		this.cod = cod;
		this.description = description;
	}

	public int getCod() {
		return cod;
	}

	public String getDescription() {
		return description;
	}

	public static DurationEnum toEnum(Integer cod) {

		if (cod == null) {
			return null;
		}

		for (DurationEnum x : DurationEnum.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}

		throw new IllegalArgumentException("Id inválido " + cod);
	}

}
