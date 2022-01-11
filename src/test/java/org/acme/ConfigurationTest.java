package org.acme;

import static org.junit.jupiter.api.Assertions.assertEquals;
import javax.inject.Inject;
import org.junit.jupiter.api.Test;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class ConfigurationTest {
    
    @Inject
    DemoConfig config;

    @Test
    void testGreet() {
        assertEquals("Demo", config.greet());
    }
}
