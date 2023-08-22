package difference_hashmap_hashset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("Nam",20, "HN");
        Student student2 = new Student("Hung",21, "HN");
        Student student3 = new Student("Ha",22, "HN");
        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(4,student1);
        System.out.println("HASHMAP: ");
        System.out.println(studentMap);

//        for(Map.Entry<Integer, Student> student : studentMap.entrySet()){
//            System.out.println(student.toString());
//        }
        System.out.println("HASHSET: ");
        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);
        System.out.println(students);
//        for(Student student : students){
//            System.out.println(student.toString());
//        }
    }
}