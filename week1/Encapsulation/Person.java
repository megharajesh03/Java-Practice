//Encapsulation1
package com.demo;

class Person {
    private int age;
    private String name;

    public Person(String name, int age) {
        this.name = name; 
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayPersonDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    public static void main(String[] args) {
        Person person = new Person("Danny Badger", 30);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        person.setName("Daniel Ricc");
        person.setAge(28);

        person.displayPersonDetails();
    }
}



