package models;

public class Students {
    private int id;
    private String name;
    private int age;
    private String gender;
    private double avgPoint;
    private Classes classes;

    public Students(int id, String name, int age, String gender, double avgPoint, Classes classes) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.avgPoint = avgPoint;
        this.classes = classes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getAvgPoint() {
        return avgPoint;
    }

    public void setAvgPoint(double avgPoint) {
        this.avgPoint = avgPoint;
    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Students{" + "id=" + id + ", name=" + name + ", age=" + age +
                ", gender=" + gender + ", avgPoint=" + avgPoint + ", classes=" + classes + '}';
    }
}