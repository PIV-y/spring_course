package com.piv.spring;

public class Dog implements Pet {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog() {
        System.out.println("Dog has been created");
    }

    public void say()
    {
        System.out.println("Bow-Wow");
    }
}
