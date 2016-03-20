package com.pavetok.parallon;

class Application {

    private String host;

    public Application() {
        // empty
    }

    public String getHost() {
        return host;
    }

    @Override
    public String toString() {
        return "Application{" +
                "host='" + host + '\'' +
                '}';
    }

    void setHost(String host) {
        this.host = host;
    }
}
