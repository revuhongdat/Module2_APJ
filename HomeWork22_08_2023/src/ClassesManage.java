import java.util.ArrayList;

public class ClassesManage {
    private ArrayList<Classes> classesList = new ArrayList<>();
    private int classesID = 1;

    public ArrayList<Classes> getClassesList() {
        return classesList;
    }

    public ClassesManage() {}

    public void setClassesList(ArrayList<Classes> classesList) {
        this.classesList = classesList;
    }

    public int getClassesID() {
        return classesID;
    }

    public void setClassesID(int classesID) {
        this.classesID = classesID;
    }

    public void createClass(String name) {
        Classes newClass = new Classes(classesID, name);
        classesList.add(newClass);
        classesID++;
    }

    public void editClass(int id, String name) {
        for (Classes cls : classesList) {
            if (cls.getId() == id) {
                classesList.remove(cls);
                Classes newClass = new Classes(id, name);
                classesList.add(newClass);
                break;
            }
        }
    }

    public void displayClasses() {
        System.out.println("CLASSES:");
        for (Classes e : classesList) {
            System.out.printf("%-5d - %-10s\n",e.getId(),e.getName());
        }
    }
}
