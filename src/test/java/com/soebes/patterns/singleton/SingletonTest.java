package com.soebes.patterns.singleton;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class SingletonTest {

	@Test
	public void testCheck() {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		AssertJUnit.assertTrue(s1.equals(s2));
	}
}
