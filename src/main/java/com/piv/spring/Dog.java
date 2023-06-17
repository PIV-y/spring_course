package com.piv.spring;

public class Dog implements Pet {

    public Dog() {
        System.out.println("Dog has been created");
    }

    public void say()
    {
        System.out.println("Bow-Wow");
    }

    public void init(){
        System.out.println("Class Dog: init method");
    }
    public void destroy(){
        System.out.println("Class Dog: destroy method");
    }
}
