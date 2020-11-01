package com.demo.accounts;

public class Saving extends Account {
	private static double intrate;
	private static double minbal;
	static {
		intrate = 0.04;
		minbal = 25000;
	}

	// default constructor
	public Saving() {
		super();
	}

	// parameterized constructor
	public Saving(int id, String name, double bal) {
		super(id, name, bal);
	}
	
	//getter and setter methods
	public static double getIntrate() {
		return intrate;
	}

	public static void setIntrate(double intrate) {
		Saving.intrate = intrate;
	}

	public static double getMinbal() {
		return minbal;
	}

	public static void setMinbal(double minbal) {
		Saving.minbal = minbal;
	}

}
