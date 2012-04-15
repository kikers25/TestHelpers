package com.pobox.cbarham.App;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.pobox.cbarham.testhelpers.EqualsHashCodeTestCase;

public class AppEqualsHashCodeTest extends EqualsHashCodeTestCase {
	@Override
	protected App createInstance() throws Exception {
		return new App("aa");
	}

	@Override
	protected App createNotEqualInstance() throws Exception {
		return new App("ZZ");
	}

	@Test
	public void testAssertTrue() {
		assertTrue(true);
	}
}
