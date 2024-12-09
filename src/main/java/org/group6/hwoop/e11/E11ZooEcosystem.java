package org.group6.hwoop.e11;

import java.util.ArrayList;
import java.util.List;

public class E11ZooEcosystem {
    public static void main(String[] args) {
        List<Animal> zooMembers = new ArrayList<>();

        zooMembers.add(new Lion());
        zooMembers.add(new Lion("Simba", 4, "Zoo Miami (Florida)"));
        zooMembers.add(new Lion("Mufasa", 9, "Smithsonian's National Zoo (USA)"));

        zooMembers.add(new Elephant());
        zooMembers.add(new Elephant("Dumbo", 14, "San Diego Zoo (California)"));
        zooMembers.add(new Elephant("Ramu", 51, "National Zoological Park (New Delhi)"));

        zooMembers.add(new Parrot());
        zooMembers.add(new Parrot("Polly", 7, "San Diego Zoo (USA)"));
        zooMembers.add(new Parrot("Coco", 4, "San Francisco Zoo (USA)"));

        zooMembers.add(new Eagle());
        zooMembers.add(new Eagle("Zeus", 7, "San Diego Zoo (USA)"));
        zooMembers.add(new Eagle("Storm", 4, "Smithsonian's National Zoo (USA)"));

        for (Animal animal : zooMembers) {
            System.out.println("-----------------------------");
            animal.displayInformation();
            animal.eat();
            animal.makeSound();
            animal.sleep();
        }
    }
}
