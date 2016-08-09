package com.pavetok.parallon;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import static java.lang.System.getProperty;
import static java.util.Arrays.asList;

class Config {
    private static BlockingQueue<String> hosts =
            new LinkedBlockingQueue<>(asList(getProperty("hosts", "localhost").split(",")));

    static String acquireHost() throws InterruptedException {
        return hosts.take();
    }

    static void releaseHost(String host) {
        hosts.add(host);
    }
}
