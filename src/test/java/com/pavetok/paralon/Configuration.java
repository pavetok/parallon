package com.pavetok.paralon;

import java.util.concurrent.ConcurrentLinkedQueue;

import static java.lang.System.getProperty;
import static java.util.Arrays.asList;

class Configuration {
    private static ConcurrentLinkedQueue<String> hosts = new ConcurrentLinkedQueue<>(asList(getProperty("hosts").split(",")));

    static String takeHost() {
        return hosts.poll();
    }

    static void releaseHost(String host) {
        hosts.add(host);
    }
}
