package com.yourself;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

public class PitfallsRunners {

	@Test
	public void immutable() {
		new Pitfalls().immutable();
	}
}