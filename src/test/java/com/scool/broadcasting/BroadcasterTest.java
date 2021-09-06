package com.scool.broadcasting;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class BroadcasterTest {
    private final Logger LOGGER = LoggerFactory.getLogger(getClass());

    @BeforeAll
    public void beforeClass() {
        Broadcaster.addReceiver(new Receiver1());
        Broadcaster.addReceiver(new Receiver2());
    }

    @Test
    void testSendBroadcast() {
        try {
            Broadcaster.sendBroadcast("Does this work");
        } catch (Exception e) {
            LOGGER.error("An error occurred: {}", e);
            fail();
        }
    }
}