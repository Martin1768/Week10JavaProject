package org.group6.hwoop.e11;

public class Bird extends Animal {
    final private String animalClass = "bird";
    private String animalSpecies;

    public String getAnimalSpecies() {
        return animalSpecies;
    }

    public void setAnimalSpecies(String animalSpecies) {
        this.animalSpecies = animalSpecies;
    }

    public String getAnimalClass() {
        return animalClass;
    }

    @Override
    void displayInformation() {
        System.out.printf("I'm a %s.\n", animalClass);
    }

    @Override
    public void eat() {
        // throw new UnsupportedOperationException("Not supported yet.");
        System.out.printf("The %s eats.\n", animalClass);
    }

    @Override
    public void makeSound() {
        // throw new UnsupportedOperationException("Not supported yet.");
        System.out.printf("The %s makes a sound.\n", animalClass);
    }

    @Override
    public void sleep() {
        // throw new UnsupportedOperationException("Not supported yet.");
        System.out.printf("The %s is sleeping.\n", animalClass);
    }
}
