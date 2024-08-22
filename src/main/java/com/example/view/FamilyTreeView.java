package com.example.view;

import com.example.model.Person;

import java.util.List;

public class FamilyTreeView {
    public void displayChildren(Person person) {
        if (person != null) {
            System.out.println("Children of " + person.getName() + ":");
            for (Person child : person.getChildren()) {
                System.out.println(child.getName());
            }
        } else {
            System.out.println("Person not found.");
        }
    }

    public void displayPeople(List<Person> people) {
        for (Person person : people) {
            System.out.println(person.getName() + " - " + person.getBirthDate());
        }
    }
}