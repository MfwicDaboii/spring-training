package com.topdogs.training.configuration;

import com.topdogs.training.providers.HelloMessageProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
*   De @Configuration-annotatie in Spring markeert een klasse als bron van
*   bean-definities voor de Spring IoC-container (Inversion of Control).
*   Het geeft aan dat de klasse één of meer methoden bevat, geannoteerd met
*   @Bean, die beans aanmaken en beheren binnen de Spring-context.
* */
@Configuration
public class HelloConfiguration {

    @Bean
    public HelloMessageProvider messageProvider() {
        return new HelloMessageProvider();
    }
}
