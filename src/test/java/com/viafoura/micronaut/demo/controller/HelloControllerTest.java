package com.viafoura.micronaut.demo.controller;

import static org.junit.jupiter.api.Assertions.*;

import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.*;

@MicronautTest
class HelloControllerTest {

    @Test
    void testHello(@Client("/") HttpClient client) {
        var message = client
                .toBlocking()
                .retrieve("/hello/Viafoura");
        assertEquals("Hello Viafoura", message);
    }

}