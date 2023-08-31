package services;
import models.Students;
import java.util.Comparator;
public class ComparatorAge implements Comparator<Students> {
    @Override
    public int compare(Students o1, Students o2) {
        return o1.getAge() - o2.getAge();
    }
}
