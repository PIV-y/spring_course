package com.piv.spring;

public class Dog implements Pet {
    public Dog() {
        System.out.println("Dog has been created");
    }

    public void say()
    {
        System.out.println("Bow-Wow");
    }
}
