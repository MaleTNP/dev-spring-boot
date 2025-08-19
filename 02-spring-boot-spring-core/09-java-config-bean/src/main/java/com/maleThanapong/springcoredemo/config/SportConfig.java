package com.maleThanapong.springcoredemo.config;

import com.maleThanapong.springcoredemo.common.Coach;
import com.maleThanapong.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    // step2: Define @Bean method to configure the bean
    // We can custom bean id as we want "aquatic"
    @Bean("aquatic")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
