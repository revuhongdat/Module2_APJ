package services;

import models.Classes;
import models.Students;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentsManager {
    private static int INDEX = 0;
    private final ArrayList<Students> studentList;
    private final Scanner scanner;

    public StudentsManager() {
        studentList = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public ArrayList<Students> getStudentList() {
        return studentList;
    }

    public void addStudent(ClassesManager classesManager) {
        String name = scanner.nextLine();
        int age = ExceptionManager.ExceptionAge();
        String gender = ExceptionManager.ExceptionGender();
        double avg = ExceptionManager.ExceptionAvg();
        //-------------------------------
        // hiển thị danh sách lớp => cho ng dùng nhập id
        // lấy đối tượng id từ manager => thêm vào student
        // nếu chưa có lớp thì thêm mục tạo lớp mới cho học sinh
        if (classesManager.getClassesList().isEmpty()) {
            System.out.println("List of Class is empty, you can create new class here!");
            classesManager.createClasses();
            Classes classes = classesManager.findClassById(1);
            Students students = new Students(INDEX++, name, age, gender, avg, classes);
            studentList.add(students);
        } else {
            System.out.println("Choice classes: ");
            classesManager.displayClasses();
            System.out.println("Enter id classes your choice: ");
            int idClasses = Integer.parseInt(scanner.nextLine());
            Classes classes = classesManager.findClassById(idClasses);
            //-------------------------------
            Students students = new Students(++INDEX, name, age, gender, avg, classes);
            studentList.add(students);
        }
    }
public void loadStudent(ArrayList<String[]> arrayList, ClassesManager classesManager) {
    for (int i = 0; i < arrayList.size(); i++) {
        int id = Integer.parseInt(arrayList.get(i)[0]);
        if (INDEX < id) {
            INDEX = id;
        }
        String name = arrayList.get(i)[1];
        int age = Integer.parseInt(arrayList.get(i)[2]);
        String gender = arrayList.get(i)[3];
        double avg = Double.parseDouble(arrayList.get(i)[4]);
        int idClass = Integer.parseInt(arrayList.get(i)[5]);
        Classes classes = classesManager.findClassById(idClass);
        Students student = new Students(id, name, age, gender, avg, classes);
        studentList.add(student);
    }
}
    public void displayStudent(){
        for (Students student : studentList) {
            System.out.println(student);
        }
    }

    public void displayStudentById(){
        System.out.println("Enter ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Students students : studentList) {
            if (students.getId() == id) {
                System.out.println(students);
                break;
            }
        }
    }
    public void deleteStudent(){
        System.out.println("Enter ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        Students students = findById(id);
        if (students == null) {
            System.out.println("Not found!");
        } else {
            studentList.remove(students);
            System.out.println("Delete successfully!");
        }
    }
    public void editStudent(ClassesManager classesManager){
        System.out.println("Enter ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        Students students = findById(id);
        if (students == null) {
            System.out.println("Not found!");
        } else {
            System.out.println("Enter new name of student : ");
            String name = scanner.nextLine();
            System.out.println("Enter new age of student : ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter new gender student : ");
            String gender = scanner.nextLine();
            System.out.println("Enter new avg point of student : ");
            double avg = Double.parseDouble(scanner.nextLine());
            //-------------------------------
            // hiển thị danh sách lớp => cho ng dùng nhập id
            // lấy đối tượng id từ manager => thêm vào student
            System.out.println("Select new classes of student : ");
            classesManager.displayClasses();
            System.out.println("Enter id of new class of student : ");
            int idClasses = Integer.parseInt(scanner.nextLine());
            Classes c = classesManager.findClassById(idClasses);
            //-------------------------------

            students.setName(name);
            students.setAge(age);
            students.setGender(gender);
            students.setAvgPoint(avg);
            students.setClasses(c);
            System.out.println("Edit successfully!");
        }
    }

    private Students findById(int id) {
        for (Students s : studentList) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }


    public void findStudent(){
        ArrayList<Students> listFind = new ArrayList<>();
        System.out.println("Enter name: ");
        String nameSearch = scanner.nextLine();
        for (Students s : studentList) {
            if (s.getName().contains(nameSearch)) {
                listFind.add(s);
            }
        }
        if (listFind.isEmpty()) {
            System.out.println("Not exists student have this name!");
        } else {
            for (Students students : listFind) {
                System.out.println(students);
            }
        }
    }

    public void sortByAge(ComparatorAge comparatorAge) {
        studentList.sort(comparatorAge);
    }

    public void sortByAvgPoint(ComparatorAvgPoint comparatorAvgPoint) {
        studentList.sort(comparatorAvgPoint);
    }
}
