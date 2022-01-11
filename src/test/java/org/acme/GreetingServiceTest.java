package org.acme;

import static org.junit.jupiter.api.Assertions.assertEquals;
import javax.inject.Inject;
import org.junit.jupiter.api.Test;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class GreetingServiceTest {

    @Inject
    GreetingService greet;
    
    @Test
    public void testHello() {
       assertEquals("Hello Demo, go go commando", greet.hello("Demo"));
    }

}
