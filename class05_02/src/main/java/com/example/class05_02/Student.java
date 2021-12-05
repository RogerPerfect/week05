package com.example.class05_02;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;

import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@ConfigurationProperties(prefix = "student")
public class Student implements Serializable, BeanNameAware, ApplicationContextAware {


    private int id;
    private String name;

    private String beanName;
    private ApplicationContext applicationContext;

    public void init(){
        System.out.println("hello...........");
    }
    
    public static Student create(){
        return new Student(103,"KK10111",null, null);
    }

    public void print() {
        System.out.println(this.beanName);
        System.out.println("   context.getBeanDefinitionNames() ===>> "
                + String.join(",", applicationContext.getBeanDefinitionNames()));

    }


}
