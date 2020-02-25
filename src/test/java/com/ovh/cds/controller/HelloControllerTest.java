package com.ovh.cds.controller;

import com.ovh.cds.model.ResponseHello;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloControllerTest {

    @Test
    public void TestSayHelloTests() {
        HelloController hc = new HelloController();
        ResponseHello r = hc.sayHello("cds");
        Assertions.assertEquals("cds", r.getHello());
    }
}
