package com.pavetok.parallon;

import java.util.concurrent.ConcurrentLinkedQueue;

import static java.lang.System.getProperty;
import static java.util.Arrays.asList;

class Configuration {
    private static ConcurrentLinkedQueue<String> hosts = new ConcurrentLinkedQueue<>(asList(getProperty("hosts").split(",")));

    static String acquireHost() {
        return hosts.poll();
    }

    static void releaseHost(String host) {
        hosts.add(host);
    }
}
