package com.stackroute;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public actor getactor()
    {
        actor actor = new actor();
        actor.setName("Salman khan");
        actor.setGender("Male");
        actor.setAge(52);
        return actor;
    }

    @Bean
    public movie getmovie()
    {
        movie movie = new movie();

        return movie;
    }

}