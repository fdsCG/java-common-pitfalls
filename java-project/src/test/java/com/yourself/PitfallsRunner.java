package com.yourself;

import org.junit.Test;

public class PitfallsRunner {

	@Test
	public void stringImmutable() {
		StringImmutable.exec();
	}
	
	@Test
	public void bigIntegerImmutable() {
		BigIntegerImmutable.exec();
	}
	
	@Test
	public void stringEquality() {
		StringEquality.exec();
	}
	
	@Test
	public void integerEquality() {
		IntegerEquality.exec();
	}
}