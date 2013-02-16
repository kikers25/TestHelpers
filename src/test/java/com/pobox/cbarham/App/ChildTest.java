
package com.pobox.cbarham.App;

import org.junit.Before;
import org.junit.Test;

public class ChildTest {

    private Child child;

    @Before
    public void setUp()
            throws Exception {

        child = new Child();

    }

    @Test
    public void testing() {

        child.morecrap();
    }
}
