package com.piv.spring;

public class Person {
    private Pet pet;
    private String surname;
    private int age;

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
        System.out.println("sureName has been set");
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
        System.out.println("age has been set");
    }
    public void setPet(Pet pet) {
        System.out.println("Class Person: set Pet");
        this.pet = pet;
    }
    public void callYourPet() {
        System.out.println("Hello, my lovely pet!");
        pet.say();
    }
}
