package com.example.class05_02;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.annotation.Resource;

@Data
@Configuration
@EnableConfigurationProperties(Student.class)
@Import(Klass.class)
public class School implements ISchool {
    
    // Resource 
    //@Autowired(required = true)
    //
    @Autowired
    Klass class1;
    
    //@Resource(name = "student100")
    @Autowired
    Student student100;
    
    @Override
    public void ding(){
    
        //System.out.println("Class1 have " + this.class1.getStudents().size() + " students and one is " + this.student100);
        System.out.println("students is " + this.student100);
        //System.out.println("Class1 have " + this.class1.getStudents().size());
    }
    
}
