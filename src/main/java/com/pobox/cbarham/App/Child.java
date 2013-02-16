package com.pobox.cbarham.App;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Calendar;
import java.util.Date;


public class Child extends Parent {

    private final static Logger LOGGER = LoggerFactory.getLogger(Child.class);

    public void morecrap() {

        LOGGER.debug("morecrap() - start");

        Date date = Calendar.getInstance().getTime();
        LOGGER.error("shite", new RuntimeException("pants"));
        doesStuff();
        LOGGER.debug("morecrap() - end");
    }
}
