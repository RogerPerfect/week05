package com.example.class05_02;

import lombok.Data;
import org.springframework.context.annotation.Bean;

import java.util.List;

@Data
public class Klass {
    
    List<Student> students;
    
    public void dong(){
        System.out.println(this.getStudents());
    }
    
}
