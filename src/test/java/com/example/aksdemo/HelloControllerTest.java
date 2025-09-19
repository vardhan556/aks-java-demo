package com.example.aksdemo;

import com.example.aksdemo.controller.HelloController;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloControllerTest {

    private final HelloController controller = new HelloController();

    @Test
    void testHelloEndpoint() {
        String response = controller.hello();
        assertThat(response).isEqualTo("Hello from Java Maven AKS Demo!");
    }
}
