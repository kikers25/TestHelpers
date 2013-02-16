package com.pobox.cbarham.App;

import com.pobox.cbarham.testhelpers.SerializabilityTestCase;

import java.io.Serializable;

public class AppSerializabilityTest extends SerializabilityTestCase {
    @Override
    protected Serializable createInstance() throws Exception {
        return new App("FFF");
    }
}
