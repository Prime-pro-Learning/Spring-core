package com.spring;
public class GreetingServiceImpl implements GreetingService{
    private String greeting;
    public GreetingServiceImpl(){
        System.out.println("default constructor");
    }
    public GreetingServiceImpl(String greeting){
        this.greeting=greeting;
        System.out.println("Parameter constructor is calling");
    }
    @Override
    public void sayGreeting() {
        System.out.println(greeting);
    }
    public void setGreeting(String greeting){
        this.greeting=greeting;
        System.out.println("setGreeting method is calling");
    }

}
