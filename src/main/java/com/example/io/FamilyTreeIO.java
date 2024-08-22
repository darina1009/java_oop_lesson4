package com.example.io;

import com.example.interfaces.FamilyTreeIOInterface;
import com.example.model.FamilyTree;

import java.io.*;

public class FamilyTreeIO implements FamilyTreeIOInterface {

    @Override
    public void writeFamilyTreeToFile(FamilyTree familyTree, String filePath) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(familyTree);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public FamilyTree readFamilyTreeFromFile(String filePath) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            return (FamilyTree) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
