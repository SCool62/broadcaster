package com.scool.broadcasting;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Receiver2  implements BroadcastReceiver{
    private static final Logger LOGGER = LoggerFactory.getLogger(Receiver2.class);

    @Override
    public void onBroadcast(String msg) {
        LOGGER.info(msg);
    }
}
