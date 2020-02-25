package com.ovh.cds.model;

public class ResponseHello {

    private String hello;

    public ResponseHello(String n) {
        this.hello = n;
    }

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }
}
