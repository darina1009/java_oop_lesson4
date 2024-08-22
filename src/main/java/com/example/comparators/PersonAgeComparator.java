package com.example.comparators;

import com.example.model.Person;

import java.util.Comparator;
import java.util.Date;

public class PersonAgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        Date now = new Date();
        long age1 = now.getTime() - p1.getBirthDate().getTime();
        long age2 = now.getTime() - p2.getBirthDate().getTime();
        return Long.compare(age1, age2);
    }
}
