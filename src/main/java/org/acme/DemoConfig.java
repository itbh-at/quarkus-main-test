package org.acme;

import io.smallrye.config.ConfigMapping;
import io.smallrye.config.WithDefault;

@ConfigMapping(prefix = "demo")
public interface DemoConfig {

    @WithDefault("Demo")
    String greet();
    
}