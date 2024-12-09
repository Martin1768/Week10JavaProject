package org.group6.hwoop.e11;

public class Parrot extends Bird {
    private String name;
    private int age;
    private String location;

    public Parrot() {
        setAnimalSpecies("parrot");
        this.name = "without a name";
        this.age = 0;
        this.location = "South America";
    }

    public Parrot(String name, int age, String location) {
        this();
        if (name != null && !name.isBlank()) this.name = name;
        if (age > 0) this.age = age;
        if (location != null && !location.isBlank()) this.location = location;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        String[] preys = {"seeds", "fruits", "nuts", "vegetables"};
        int n = (int)(Math.random() * 4);
        System.out.printf("The %s %s eats a %s.\n", getAnimalSpecies(), name, preys[n]);
    }

    @Override
    public void makeSound() {
        String[] sounds = {
                "is squawking.",
                "is whistling.",
                "is chattering.",
                "is silent.",
                "is talking."};
        int n = (int)(Math.random() * 5);
        if (age == 0) n = 3;
        System.out.printf("The %s %s %s\n", getAnimalSpecies(), name, sounds[n]);
    }

    @Override
    public void sleep() {
        int n = (int)(Math.random() * 2);
        if (n == 0) System.out.printf("The %s %s is sleeping.\n", getAnimalSpecies(), name);
        else System.out.printf("The %s %s is awake.\n", getAnimalSpecies(), name);
    }

    @Override
    void displayInformation() {
        System.out.printf("I'm a %s, ", getAnimalSpecies());
        if (name.equals("without a name")) System.out.print("I don't have a name yet");
        else System.out.print("my name is " + name);
        System.out.print(", I'm " + ((age == 0)? String.format("a %s chick", getAnimalSpecies()):String.format("%d years old", age)));
        System.out.printf(" and I live in %s.\n", location);
    }
}
