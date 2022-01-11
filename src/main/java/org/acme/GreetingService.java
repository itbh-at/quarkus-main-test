package org.acme;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {

    public String hello(String name) {
        return String.format("Hello %s, go go commando", name);
    }

}
