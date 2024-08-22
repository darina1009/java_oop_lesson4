package com.example.interfaces;

import com.example.model.FamilyTree;

public interface FamilyTreeIOInterface {
    void writeFamilyTreeToFile(FamilyTree familyTree, String filePath);
    FamilyTree readFamilyTreeFromFile(String filePath);
}
