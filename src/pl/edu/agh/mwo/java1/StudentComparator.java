package pl.edu.agh.mwo.java1;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.calculateGradesAverage() > o2.calculateGradesAverage()) {
            return -1;
        } else if (o1.calculateGradesAverage() < o2.calculateGradesAverage()) {
            return 1;
        }
        return 0;
    }
}
