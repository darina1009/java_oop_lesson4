package com.example.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FamilyTree implements Serializable, Iterable<Person> {
    private static final long serialVersionUID = 1L;

    private List<Person> people;

    public FamilyTree() {
        this.people = new ArrayList<>();
    }

    public void addPerson(Person person) {
        this.people.add(person);
    }

    public List<Person> getChildren(Person person) {
        return person.getChildren();
    }

    public Person findPersonByName(String name) {
        for (Person person : people) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        return null;
    }

    @Override
    public Iterator<Person> iterator() {
        return people.iterator();
    }

    public void sortPeopleByName() {
        people.sort(new PersonNameComparator());
    }

    public void sortPeopleByBirthDate() {
        people.sort(new PersonBirthDateComparator());
    }

    public void sortPeopleByChildrenCount() {
        people.sort(new PersonChildrenCountComparator());
    }

    public void sortPeopleByAge() {
        people.sort(new PersonAgeComparator());
    }

    public List<Person> getPeople() {
        return people;
    }
}