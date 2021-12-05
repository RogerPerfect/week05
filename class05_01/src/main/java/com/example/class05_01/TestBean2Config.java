package com.example.class05_01;

import org.springframework.context.annotation.Bean;

public class TestBean2Config {
    @Bean
    public TestBean2 testBean2(){
        return new TestBean2(22,"john");
    }
}
