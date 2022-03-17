package pl.edu.agh.mwo.java1;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {

//        let's create some student'
        Student student1 = new Student("Jan", 2, 3, 5, 6, 2);
        Student student2 = new Student("Maciek", 1, 1, 1, 5);
        Student student3 = new Student("Kasia", 5, 5, 5, 6, 5, 4);
        Student student4 = new Student("Ania", 1, 2);
        Queue<Student> students = new PriorityQueue<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        System.out.println("Students served in their grades average order");

        while (!students.isEmpty()) {
            System.out.println(students.poll());
        }
    }
}
