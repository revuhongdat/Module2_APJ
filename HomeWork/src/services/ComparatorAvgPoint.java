package services;
import models.Students;
import java.util.Comparator;
public class ComparatorAvgPoint implements Comparator<Students> {

    @Override
    public int compare(Students o1, Students o2) {
        if(o1.getAvgPoint() > o2.getAvgPoint()){
            return 1;
        }else if(o1.getAvgPoint() == o2.getAvgPoint()){
            return 0;
        }else {
            return -1;
        }
    }
}

