package com.example.service;

import com.example.model.FamilyTree;
import com.example.model.Person;

import java.util.List;

public class FamilyTreeService {
    private FamilyTree familyTree;

    public FamilyTreeService(FamilyTree familyTree) {
        this.familyTree = familyTree;
    }

    public Person getPersonByName(String name) {
        return familyTree.findPersonByName(name);
    }

    public List<Person> getSortedPeopleByName() {
        familyTree.sortPeopleByName();
        return familyTree.getPeople();
    }

    public List<Person> getSortedPeopleByBirthDate() {
        familyTree.sortPeopleByBirthDate();
        return familyTree.getPeople();
    }

    public List<Person> getSortedPeopleByChildrenCount() {
        familyTree.sortPeopleByChildrenCount();
        return familyTree.getPeople();
    }

    public List<Person> getSortedPeopleByAge() {
        familyTree.sortPeopleByAge();
        return familyTree.getPeople();
    }
}
