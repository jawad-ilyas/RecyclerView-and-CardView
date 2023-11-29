package com.example.recyclerviewandcardview;

public class Person {
    private  String name;
    private String description; // Changed from Description to description
    private String preference;

    public Person() {
        // Default constructor
    }

    public Person(String name, String description, String preference) {
        this.name = name;
        this.description = description;
        this.preference = preference;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getPreference() {
        return preference;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPreference(String preference) {
        this.preference = preference;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", preference='" + preference + '\'' +
                '}';
    }
}
