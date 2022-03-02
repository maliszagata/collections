package pl.edu.agh.mwo.java1;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        int dimmension = 10;
        List<Set> someList = new ArrayList<>();
        for (int i = 0; i < dimmension; i++) {
            Set<Integer> integers = new HashSet<>();
            for (int j = 0; j < dimmension; j++) {
                integers.add(random.nextInt(1000) + 100);
            }
            someList.add(integers);
        }

        divisibleByNumber(someList, 7);

        List<String> myList = new NewArrayList<>();
        for (int i = 10; i >= 0; i--) {
            myList.add(String.valueOf(i));
        }

        System.out.println(myList);
        System.out.println();

        myList.remove("5");
        System.out.println(myList);
        System.out.println();

        myList.remove("2");
        System.out.println(myList);
        System.out.println();

        myList.remove(null);
        System.out.println(myList);
        System.out.println();


    }

    public static List<Integer> divisibleByNumber(List<Set> list, Integer divider) {
        List<Integer> finalList = new ArrayList<>();
        for (Set integers : list) {
            for (Object integer : integers) {
                if ((int) integer % 7 == 0) {
                    System.out.println(integer);
                    finalList.add((int) integer);
                }
            }
        }

        return finalList;
    }

}
