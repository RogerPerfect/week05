package com.example.class05_02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@EnableConfigurationProperties(Student.class)
public class WebAutoConfiguration {

    @Bean
    public ISchool iSchool(){
        return new School();
    }

}
