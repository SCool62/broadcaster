package com.scool.broadcasting;

import java.util.ArrayList;

public class Broadcaster {

    private static final ArrayList<BroadcastReceiver> receivers = new ArrayList<BroadcastReceiver>();

    public static void sendBroadcast(String msg) {
        for (BroadcastReceiver receiver : receivers) {
            receiver.onBroadcast(msg);
        }
    }

    public static void addReceiver(BroadcastReceiver clazz) {
        receivers.add(clazz);
    }


}
