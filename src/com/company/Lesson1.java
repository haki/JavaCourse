package com.company;

import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        FirstJavaProgram();
        CatsAreRobots();
        From0to5();
        WeNeedtoLearnJava();
        TicTacToe();
    }

    private static void TicTacToe() {
        System.out.println("O X X\nO X O\nX O X\n");
        /**
         String[][] TicTacToe = new String[3][3];
         int n = 1;
         for (int i = 0; i < 3; i++) {
         for (int k = 0; k < 3; k++) {
         TicTacToe[i][k] = Integer.toString(n);
         n++;
         }
         }
         Scanner scanner = new Scanner(System.in);
         while (true) {
         for (int i = 0; i < 3; i++) {
         for (int k = 0; k < 3; k++) {
         System.out.print(TicTacToe[i][k] + " ");
         }
         System.out.println();
         }
         System.out.println("Choose (ex: 1 X): ");
         String c = scanner.nextLine();
         String parts[] = c.split(" ");

         switch (parts[0]) {
         case "1":
         TicTacToe[0][0] = parts[1];
         break;
         case "2":
         TicTacToe[0][1] = parts[1];
         break;
         case "3":
         TicTacToe[0][2] = parts[1];
         break;
         case "4":
         TicTacToe[1][0] = parts[1];
         break;
         case "5":
         TicTacToe[1][1] = parts[1];
         break;
         case "6":
         TicTacToe[1][2] = parts[1];
         break;
         case "7":
         TicTacToe[2][0] = parts[1];
         break;
         case "8":
         TicTacToe[2][1] = parts[1];
         break;
         case "9":
         TicTacToe[2][2] = parts[1];
         break;
         }
         } **/
    }

    private static void WeNeedtoLearnJava() {
        System.out.println("WE NEED TO \n\nLEARN JAVA \n\nAS QUICKLY AS POSSIBLE");
    }

    private static void FirstJavaProgram() {
        System.out.println("Hello Hakan!");
    }

    private static void CatsAreRobots() {
        System.out.println("Cats are robots!");
    }

    private static void From0to5() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }
    }
}
