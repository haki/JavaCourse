package com.company;

import java.util.Scanner;

public class Lesson6 {
    public static void main(String[] args) {
        ex1();
        ex2();
    }

    private static void ex2() {
        Scanner scan = new Scanner(System.in);
        char[][] matrix = new char[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = scan.next().charAt(0);
            }
        }

        String yesNO = "YES";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrix[i][j] == matrix[i + 1][j] && matrix[i][j] == matrix[i][j + 1] && matrix[i][j] == matrix[i+1][j + 1]) {
                    yesNO = "NO";
                    break;
                }
            }
            if(yesNO.equals("NO")) break;
        }
        System.out.println(yesNO);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void ex1() {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[4];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLine();
        }

        String prity = "YES";

        for (int i = 1; i < 4; i++) {
            String l1 = arr[i - 1];
            String l2 = arr[i];
            System.out.println("Strings l1: " + l1 + "\tand l2: " + l2);
            for (int j = 1; j < 4; j++) {
                if (l1.charAt(j - 1) == l2.charAt(j - 1) && l1.charAt(j) == l2.charAt(j) && l1.charAt(j - 1) == l1.charAt(j)) {
                    prity = "NO";
                    break;
                }
            }
            if ("NO".equals(prity)) {
                break;
            }
        }
        System.out.println(prity);
    }
}
