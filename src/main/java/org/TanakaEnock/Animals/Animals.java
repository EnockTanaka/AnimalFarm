package org.TanakaEnock.Animals;

public class Animals {
    private String name;
    private int age;
    private String gender;
    private String species;
    private int weight;
    private String Diet;
    private int energyLevel;
    private Boolean status;


    public Animals() {
        name = "Bird";
        age = 5;
        gender = "Male";
        species = "Flamingo";
        weight = 20;
        Diet = "Herbivore";
        energyLevel = 30;
        status = true;
    }

    public Animals(String name, int age, String gender, int weight, String species, String diet, int energyLevel, Boolean status) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.species = species;
        Diet = diet;
        this.energyLevel = energyLevel;
        this.status = status;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getDiet() {
        return Diet;
    }

    public void setDiet(String diet) {
        Diet = diet;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}


