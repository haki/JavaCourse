package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
    }

    private static void ex5() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int x = j - i;
                x = x > 0 ? x : -x;
                //x = Math.abs(j - i);
                array[i][j] = x;
            }
        }

        for (int[] ints : array) {
            for (int i : ints) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    private static void ex4() {
        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();

        int[] arr = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            arr[i] = sc.nextInt();
        }

        int maxSeq = 1;//5
        int tempSeq = 1;//1

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {            // if nextElement > previousElement
                tempSeq++;                          // increase tempSeq
                if (maxSeq < tempSeq) {             // if maxSeq < tempSeq
                    maxSeq++;                         // increase maxSeq
                }
            } else if (arr[i] <= arr[i - 1]) {    // else if  nextElement <= previousElement
                tempSeq = 1;
            }
        }
        System.out.println(maxSeq);
    }

    private static void ex3() {
        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt(); //5

        int[] arr = new int[arrSize]; //5 8 11 2 10
        for (int i = 0; i < arrSize; i++) {
            arr[i] = sc.nextInt();
        }
        int n = sc.nextInt();//8

        long sum = 0;
        for (int x : arr) {
            if (x > n) {
                sum += x;
            }
        }

        System.out.println(sum);//21
    }

    private static void ex2() {
        int[] characters = new int[5];
        characters[0] = 12;
        characters[1] = 17;
        characters[2] = 8;
        characters[3] = 101;
        characters[4] = 33;

        System.out.println(Arrays.toString(characters));
    }

    private static void ex1() {
        char[] characters = {'a', 'z', 'e', 'd'};

        System.out.println(Arrays.toString(characters));
    }
}
