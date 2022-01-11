package org.acme;

import javax.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

@Command(name = "greeting", mixinStandardHelpOptions = true)
public class GreetingCommand implements Runnable {

    @Parameters(paramLabel = "<name>", description = "Your name.")
    String name;

    @Inject
    GreetingService greet;

    @Inject
    DemoConfig config;

    @Override
    public void run() {
        if (name == null) {
            System.out.println(greet.hello(config.greet()));
        }
        else {
            System.out.println(greet.hello(name));
        }
        
    }

}
