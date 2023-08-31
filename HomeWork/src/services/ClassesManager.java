package services;
import models.Classes;

import java.util.ArrayList;
import java.util.Scanner;


public class ClassesManager {
    private static int INDEX = 0;
    private final ArrayList<Classes> classesList;
    private final Scanner scanner;

    public static void setINDEX(int INDEX) {
        ClassesManager.INDEX = INDEX;
    }

    public ClassesManager() {
        classesList = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public ArrayList<Classes> getClassesList() {
        return classesList;
    }

    public void createClasses() {
        System.out.print("Enter name of new class : ");
        String nameNewClass = scanner.nextLine();
        Classes newClass = new Classes(++INDEX, nameNewClass);
        classesList.add(newClass);
    }
    public void loadClasses(ArrayList<String[]> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            int id = Integer.parseInt(arrayList.get(i)[0]);
            if (INDEX < id) {
                INDEX = id;
            }
            String name = arrayList.get(i)[1];
            Classes newClass = new Classes(id, name);
            classesList.add(newClass);
        }
    }


    public void displayClasses() {
        for (Classes c : classesList) {
            System.out.println(c);
        }
    }

    public Classes findClassById(int id) {
        for (Classes c : classesList) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    public void editClasses() {
        System.out.print("Enter the id of class you want edit :");
        int id = Integer.parseInt(scanner.nextLine());
        Classes c = findClassById(id);
        if (c != null) {
            System.out.println("Enter the new name of class :");
            String newName = scanner.nextLine();
            c.setName(newName);
            System.out.println("Edit name successfully!");
        } else {
            System.out.println("Not found!!!");
        }
    }
}
