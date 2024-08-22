package com.example.utils;

import com.example.model.Person;

public class FamilyTreeUtils {
    public static void printChildren(Person person) {
        if (person != null) {
            System.out.println("Children of " + person.getName() + ":");
            for (Person child : person.getChildren()) {
                System.out.println(child.getName());
            }
        } else {
            System.out.println("Person not found.");
        }
    }
}
