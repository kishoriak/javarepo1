package com.demo.accounts;

public class Current extends Account {
	private static double intrate;
	private static double minbal;
	static {
		intrate = 0.01;
		minbal = 0.0;
	}

	// default constructor
	public Current() {
		super();
	}

	public Current(int id, String name, double bal) {
		super(id, name, bal);
	}
	
	//getter and setter methods
	public static double getIntrate() {
		return intrate;
	}

	public static void setIntrate(double intrate) {
		Current.intrate = intrate;
	}

	public static double getMinbal() {
		return minbal;
	}

	public static void setMinbal(double minbal) {
		Current.minbal = minbal;
	}

}
