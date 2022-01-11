package org.acme;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

@Command(name = "greeting", mixinStandardHelpOptions = true)
public class GreetingCommand implements Runnable {

    @Parameters(paramLabel = "<name>", defaultValue = "picocli", description = "Your name.")
    String name;

    @Inject
    GreetingService greet;

    @Override
    public void run() {
        System.out.println(greet.hello(name));
    }

}
