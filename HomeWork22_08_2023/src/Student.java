public class Student {
    private int id;
    private String name;
    private int age;
    private String gender;
    private double avgPoint;
    private Classes classes;

    public Student(int id, String name, int age, String gender, double avgPoint, Classes classes) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.avgPoint = avgPoint;
        this.classes = classes;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getAvgPoint() {
        return this.avgPoint;
    }

    public void setAvgPoint(double avgPoint) {
        this.avgPoint = avgPoint;
    }

    public Classes getClasses() {
        return this.classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + getName() + '\'' +
                ", gender='" + getGender() + '\'' +
                ", avgPoint=" + getAvgPoint() +
                ", Classes='" + getClasses() + '\'' +
                '}';
    }
}
