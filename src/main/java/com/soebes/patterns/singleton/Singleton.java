package com.soebes.patterns.singleton;

public final class Singleton {

	private static Singleton singleton = null;
	
	public static Singleton getInstance () {
		if (singleton == null) {
			singleton = new Singleton();
		} 
		return singleton;
	}

	private Singleton() {
	}
}
