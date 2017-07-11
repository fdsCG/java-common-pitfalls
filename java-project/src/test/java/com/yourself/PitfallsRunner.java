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
		BigIntegerImmutable.exec();
	}
}