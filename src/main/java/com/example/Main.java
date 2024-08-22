package com.example;

import com.example.interfaces.FamilyTreeIOInterface;
import com.example.io.FamilyTreeIO;
import com.example.model.FamilyTree;
import com.example.model.Person;
import com.example.presenter.FamilyTreePresenter;
import com.example.service.FamilyTreeService;
import com.example.view.FamilyTreeView;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Создание людей
        Person grandpa = new Person("Grandpa", new Date(1950, 1, 1));
        Person grandma = new Person("Grandma", new Date(1955, 2, 2));
        Person father = new Person("Father", new Date(1980, 3, 3));
        Person mother = new Person("Mother", new Date(1985, 4, 4));
        Person child1 = new Person("Child1", new Date(2010, 5, 5));
        Person child2 = new Person("Child2", new Date(2015, 6, 6));

        // Установка родителей
        father.setFather(grandpa);
        father.setMother(grandma);
        mother.setFather(grandpa);
        mother.setMother(grandma);

        // Установка детей
        grandpa.addChild(father);
        grandma.addChild(father);
        father.addChild(child1);
        father.addChild(child2);
        mother.addChild(child1);
        mother.addChild(child2);

        // Создание генеалогического дерева
        FamilyTree familyTree = new FamilyTree();
        familyTree.addPerson(grandpa);
        familyTree.addPerson(grandma);
        familyTree.addPerson(father);
        familyTree.addPerson(mother);
        familyTree.addPerson(child1);
        familyTree.addPerson(child2);

        // Создание сервиса для работы с генеалогическим деревом
        FamilyTreeService familyTreeService = new FamilyTreeService(familyTree);

        // Создание представления
        FamilyTreeView familyTreeView = new FamilyTreeView();

        // Создание презентера
        FamilyTreePresenter familyTreePresenter = new FamilyTreePresenter(familyTreeService, familyTreeView);

        // Получение всех детей выбранного человека
        String selectedPersonName = "Father";
        familyTreePresenter.displayChildren(selectedPersonName);

        // Запись генеалогического дерева в файл
        FamilyTreeIOInterface familyTreeIO = new FamilyTreeIO();
        String filePath = "family_tree.dat";
        familyTreeIO.writeFamilyTreeToFile(familyTree, filePath);

        // Чтение генеалогического дерева из файла
        FamilyTree loadedFamilyTree = familyTreeIO.readFamilyTreeFromFile(filePath);
        if (loadedFamilyTree != null) {
            System.out.println("Loaded Family Tree:");
            familyTreePresenter.displayChildren(selectedPersonName);
        } else {
            System.out.println("Failed to load Family Tree.");
        }

        // Сортировка и вывод списка людей
        System.out.println("Sorting by name:");
        familyTreePresenter.displaySortedPeopleByName();

        System.out.println("Sorting by birth date:");
        familyTreePresenter.displaySortedPeopleByBirthDate();

        System.out.println("Sorting by children count:");
        familyTreePresenter.displaySortedPeopleByChildrenCount();

        System.out.println("Sorting by age:");
        familyTreePresenter.displaySortedPeopleByAge();
    }
}
