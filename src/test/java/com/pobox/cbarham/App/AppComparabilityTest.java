package com.pobox.cbarham.App;

import com.pobox.cbarham.testhelpers.ComparabilityTestCase;

public class AppComparabilityTest extends ComparabilityTestCase<App> {
	@Override
	protected App createLessInstance() throws Exception {
		return new App("AAA");
	}

	@Override
	protected App createEqualInstance() throws Exception {
		return new App("FFF");
	}

	@Override
	protected App createGreaterInstance() throws Exception {
		return new App("ZZZ");
	}
}
