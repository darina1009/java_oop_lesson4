package com.example.presenter;

import com.example.model.FamilyTree;
import com.example.model.Person;
import com.example.service.FamilyTreeService;
import com.example.view.FamilyTreeView;

import java.util.List;

public class FamilyTreePresenter {
    private FamilyTreeService familyTreeService;
    private FamilyTreeView familyTreeView;

    public FamilyTreePresenter(FamilyTreeService familyTreeService, FamilyTreeView familyTreeView) {
        this.familyTreeService = familyTreeService;
        this.familyTreeView = familyTreeView;
    }

    public void displayChildren(String name) {
        Person person = familyTreeService.getPersonByName(name);
        familyTreeView.displayChildren(person);
    }

    public void displaySortedPeopleByName() {
        List<Person> people = familyTreeService.getSortedPeopleByName();
        familyTreeView.displayPeople(people);
    }

    public void displaySortedPeopleByBirthDate() {
        List<Person> people = familyTreeService.getSortedPeopleByBirthDate();
        familyTreeView.displayPeople(people);
    }

    public void displaySortedPeopleByChildrenCount() {
        List<Person> people = familyTreeService.getSortedPeopleByChildrenCount();
        familyTreeView.displayPeople(people);
    }

    public void displaySortedPeopleByAge() {
        List<Person> people = familyTreeService.getSortedPeopleByAge();
        familyTreeView.displayPeople(people);
    }
}
