package com.spring;

public class Person {
    private int id;
    private  String name;

    /*public Person(){
        System.out.println("default constructor");
    }*/

   /* public Person(int id, String name){
        this.id=id;
        this.name=name;
        System.out.println("Person constructor");
    }*/
    // Person p=new Person(123, "Ramesh");
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        System.out.println("Person setId method");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Person setName method");
    }
}
