package com.example.class05_01;


public class TestBean {
    private int id;
    private String name;
    private String beanName;

    TestBean(int id,String name){
        this.id = id;
        this.name = name;
        System.out.println("TestBean = "+this.id+"-"+this.name);
    }
    TestBean(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("TestBean id is:"+this.id + " ,name is :"+this.name);
    }

}
