package com.spring;

public class PersonGreeting implements GreetingService{
    @Override
    public void sayGreeting() {
        System.out.println("person-greeting");
    }
}
