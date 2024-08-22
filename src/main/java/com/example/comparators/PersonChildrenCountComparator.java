package com.example.comparators;

import com.example.model.Person;

import java.util.Comparator;

public class PersonChildrenCountComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return Integer.compare(p1.getChildren().size(), p2.getChildren().size());
    }
}
