package com.piv.spring;

public class Cat implements Pet {
    public Cat() {
        System.out.println("Cat hsa been created");
    }
    @Override
    public void say() {
        System.out.println("meow-meow");
    }
}
