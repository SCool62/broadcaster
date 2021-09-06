package com.scool.broadcasting;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Receiver1 implements BroadcastReceiver{
    private static final Logger LOGGER = LoggerFactory.getLogger(Receiver1.class);

    @Override
    public void onBroadcast(String msg) {
            LOGGER.info(msg);
    }
}
