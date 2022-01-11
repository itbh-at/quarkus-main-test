package org.acme;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import io.quarkus.test.junit.main.QuarkusMainLauncher;
import io.quarkus.test.junit.main.QuarkusMainTest;

@QuarkusMainTest
public class GreetingCommandTest {
    
    @Test
    public void testGreet(QuarkusMainLauncher launcher) {
       var result = launcher.launch("Demo");
       assertEquals("Hello Demo, go go commando", result.getOutput());
    }

}
