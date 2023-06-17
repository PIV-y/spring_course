package com.piv.spring;

public class Person {
    private Pet pet;

    public Person(Pet pet) {
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely pet!");
        pet.say();
    }
}
