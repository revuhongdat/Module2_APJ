package difference_comparable_comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {
    public AgeComparator() {
    }

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
}
