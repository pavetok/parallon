package com.pavetok.parallon;

public class Application {

    private String host;

    public Application() {
        // empty
    }

    public String getHost() {
        return host;
    }
    void setHost(String host) {
        this.host = host;
    }

    public String getUrl() {
        return "http://" + host;
    }

    @Override
    public String toString() {
        return "Application{" +
                "host='" + host + '\'' +
                '}';
    }
}
