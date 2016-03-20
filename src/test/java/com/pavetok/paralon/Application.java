package com.pavetok.paralon;

class Application {

    private String host;

    Application(String host) {
        this.host = host;
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
}
