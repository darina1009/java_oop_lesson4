package com.example.comparators;

import com.example.model.Person;

import java.util.Comparator;

public class PersonBirthDateComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getBirthDate().compareTo(p2.getBirthDate());
    }
}
