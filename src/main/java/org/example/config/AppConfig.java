package org.example.config;

import org.example.Alien;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class AppConfig {

    @Bean
    public Alien alien(){
        return new Alien();
    }

    //This is an example of a "prototype" if you like.
    @Bean
    @Scope("prototype") //But since it is a "singleton" by default, we need to make it a "prototype" using the "scope" annotation.
    public Desktop desktop(){
        return new Desktop();
    }
}
