package com.epam.rd.autotasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        List<Integer> array = inPut();
        System.out.println(findAverage(array));
        // Use Scanner methods to read input
    }

    static private List<Integer> inPut() {
        List<Integer> array = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int someValue = 1;
        while (counter < 100 && someValue != 0) {
            counter++;
            someValue = scanner.nextInt();
            array.add(someValue);
        }
        return array;
    }

    static private int findAverage(List<Integer> array) {
        int result = 0;
        int size = array.size();
        for (int x : array) {
            if (x == 0) {
                size--;
            }
            result += x;
        }
        return result / size;
    }
}