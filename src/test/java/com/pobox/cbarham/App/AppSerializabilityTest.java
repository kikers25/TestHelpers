package com.pobox.cbarham.App;

import java.io.Serializable;

import com.pobox.cbarham.testhelpers.SerializabilityTestCase;

public class AppSerializabilityTest extends SerializabilityTestCase {
	@Override
	protected Serializable createInstance() throws Exception {
		return new App("FFF");
	}
}
