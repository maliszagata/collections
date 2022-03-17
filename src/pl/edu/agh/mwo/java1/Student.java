package pl.edu.agh.mwo.java1;

import javax.management.remote.SubjectDelegationPermission;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student implements Comparable<Student> {
    private final String name;
    private final List<Integer> grades;

    public Student(String name, Integer... grades) {
        this.name = name;
        this.grades = new ArrayList<>(Arrays.asList(grades));
    }

    public Double calculateGradesAverage() {
        return grades.stream().mapToInt(Integer::intValue).summaryStatistics().getAverage();
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grades=" + grades +
                ", grades average=" + this.calculateGradesAverage() +
                '}';
    }


    @Override
    public int compareTo(Student that) {
        if (this.calculateGradesAverage() > that.calculateGradesAverage()) {
            return -1;
        } else if (this.calculateGradesAverage() < that.calculateGradesAverage()) {
            return 1;
        }
        return 0;
    }
}
