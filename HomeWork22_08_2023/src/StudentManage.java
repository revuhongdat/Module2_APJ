import java.util.ArrayList;
import java.util.Comparator;

class StudentManage {
    private ArrayList<Student> studentList = new ArrayList<>();
    private int studentId = 1;

    public StudentManage() {}

    public void createStudent(String name, int age, String gender, double avgPoint, Classes classes) {
        Student newStudent = new Student(studentId, name, age, gender, avgPoint, classes);
        studentList.add(newStudent);
        studentId++;
    }

    public void editStudent(int id, String name, int age, String gender, double avgPoint, Classes classes) {
        for (Student student : studentList) {
            if (student.getId() == id) {
                student = new Student(id, name, age, gender, avgPoint, classes);
                break;
            }
        }
    }

    public void deleteStudent(int id) {
        for (Student student:studentList) {
            if (student.getId() == id) {
                studentList.remove(student);
                break;
            }
        }
    }

    public void displayStudent(int id) {
        for (Student student : studentList) {
            if (student.getId() == id) {
                System.out.printf("%-5d - %-10s - %-5d - %-5s - %-5.2f - %-10s\n",
                        student.getId(), student.getName(), student.getAge(),
                        student.getGender(), student.getAvgPoint(),
                        student.getClasses().getName());
                break;
            }
        }
    }

    public void displayAllStudents() {
        System.out.println("Students:");
        for (Student student : studentList) {
            System.out.printf("ID-%5s,Name-%10s\n",student.getId(),student.getName());
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName());
        }
    }

    public void sortStudentsByAvgPoint() {
        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getAvgPoint() > o2.getAvgPoint()) {
                    return 1;
                } else if (o1.getAvgPoint() < o2.getAvgPoint()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };
    }
    public void sortStudentsByAge() {
        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getAge() > o2.getAge()) {
                    return 1;
                } else if (o1.getAge() < o2.getAge()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };
    }

    public void searchStudentByName(String keyword) {
        System.out.println("Search results for '" + keyword + "':");
        for (Student student : studentList) {
            if (student.getName().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println("ID: " + student.getId() + ", Name: " + student.getName());
            }
        }
    }
}
