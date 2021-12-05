package com.example.class05_01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;

@SpringBootApplication
public class Class0501Application {

    //TestBean testBean;

    public static void main(String[] args) {
        //SpringApplication.run(Class0501Application.class, args);
        ApplicationContext context = new ClassPathXmlApplicationContext("TestBean.xml");
        //1
        TestBean testBean = (TestBean) context.getBean("testBean");
        System.out.println("testBean = "+testBean.getName());
        //TestBean testBean1 = (TestBean) context.getBean(TestBean.class);
        //System.out.println("testBean1 = "+testBean1.getName());
        testBean.print();
        //2
        AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext(TestBean2Config.class);
        TestBean2 testBean2 = (TestBean2) context2.getBean("testBean2");
        testBean2.print();
        //3
        AnnotationConfigApplicationContext context3 = new AnnotationConfigApplicationContext(TestBean3Config.class);
        TestBean3 testBean3 = (TestBean3) context3.getBean("testBean3");
        testBean3.print();


    }

}
