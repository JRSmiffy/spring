package com.jrsmiffy.springguru.dependencyinjection.config;

import com.jrsmiffy.springguru.dependencyinjection.service.ConstructorGreetingService;
import com.jrsmiffy.springguru.dependencyinjection.service.EnglishGreetingService;
import com.jrsmiffy.springguru.dependencyinjection.service.PrimaryGreetingService;
import com.jrsmiffy.springguru.dependencyinjection.service.SpanishGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Configuration // note: tells Spring that we are defining Beans here
public class GreetingServiceConfig {

    @Profile("english")
    @Bean("i18nService") // note: this renames the bean - used for demo purposes to conflict with SpanishGreetingService
    EnglishGreetingService englishGreetingService() {
        return new EnglishGreetingService();
    }

    @Profile("spanish")
    @Bean("i18nService") // note: this renames the bean - used for demo purposes to conflict with EnglishGreetingService
    SpanishGreetingService spanishGreetingService() {
        return new SpanishGreetingService();
    }

    @Bean @Primary
    PrimaryGreetingService primaryGreetingService() {
        return new PrimaryGreetingService();
    }

    @Bean // note: the method name here drives the Bean name in the Spring Context ("constructorGreetingService")
    ConstructorGreetingService constructorGreetingService() {
        return new ConstructorGreetingService();
    }

}
