package org.TanakaEnock;


import Animals.Animals;
import Animals.Bird.Eagle;

public class Main {
    public static void main(String[] args) {

        Animals animals = new Animals();
        System.out.println(animals.toString());

        Eagle eagle = new Eagle();
        System.out.println(eagle.toString());
    }
}