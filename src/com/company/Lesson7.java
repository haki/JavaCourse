package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson7 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String[] values = scanner.nextLine().split("\\s+");
        int[] numbers = Arrays.stream(values)
                .mapToInt(Integer::parseInt)
                .toArray();
        sort(numbers);
        Arrays.stream(numbers).forEach(e -> System.out.print(e + " "));
    }

    private static void sort(int[] numbers) {
        Arrays.sort(numbers);
    }
}
