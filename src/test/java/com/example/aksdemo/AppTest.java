package com.example.aks;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testIndexHtmlExists() {
        URL resource = getClass().getClassLoader().getResource("index.html");
        assertNotNull(resource, "index.html should exist in resources folder");
    }

    @Test
    void testScriptJsExists() {
        URL resource = getClass().getClassLoader().getResource("script.js");
        assertNotNull(resource, "script.js should exist in resources folder");
    }

    @Test
    void testAppStarts() {
        // Imagine you have a main class `App.java` with a main() method
        assertDoesNotThrow(() -> {
            com.example.aks.App.main(new String[]{});
        }, "App should start without throwing exceptions");
    }

    @Test
    void testDummyLogic() {
        // A simple placeholder test to always pass
        int expected = 4;
        int actual = 2 + 2;
        assertEquals(expected, actual, "Math should still work in 2025 😉");
    }
}