package com.company;

import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        FirstJavaProgram();
        CatsAreRobots();
        From0to5();
        WeNeedtoLearnJava();
        TicTacToe();
        TicTacToeV2();
    }

    private static void TicTacToeV2() {
        Scanner scanner = new Scanner(System.in);
        String[] matrix = new String[9];
        String move;
        int n = 0;

        for (int i = 0; i < 9; i++) {
            matrix[i] = Integer.toString(i + 1);
        }
        
        boolean state = false;
        String currentMove = "x";
        String nextMove;
        while (true) {
            for (int i = 0; i < 9; i++) {
                if (matrix[i].toLowerCase().equals("x") || matrix[i].toLowerCase().equals("o")) {
                    state = true;
                } else {
                    state = false;
                    break;
                }
            }
            
            if (state) {
                System.out.println("Game Over");
                break;
            }

            for (int i = 0; i < 9; i++) {
                n++;
                System.out.print(matrix[i] + " ");
                if (n == 3) {
                    System.out.println();
                    n = 0;
                }
            }

            if (currentMove.equals("x")) {
                System.out.print("Select location for x: ");
                nextMove = "o";
            } else {
                System.out.print("Select location for o: ");
                nextMove = "x";
            }
            move = scanner.nextLine();
            int cs0 = Integer.parseInt(move);
            if (!(cs0 >= 10 || cs0 <= 0) && !(matrix[cs0 - 1].toLowerCase().equals("x") || matrix[cs0 - 1].toLowerCase().equals("o"))) {
                matrix[cs0 - 1] = currentMove;
                if (CheckWin(matrix, cs0 - 1, currentMove)) {
                    for (int i = 0; i < 9; i++) {
                        n++;
                        System.out.print(matrix[i] + " ");
                        if (n == 3) {
                            System.out.println();
                            n = 0;
                        }
                    }
                    System.out.println("Winner: " + currentMove);
                    break;
                }
                currentMove = nextMove;
            }
        }
    }

    private static boolean CheckWin(String[] matrix, int cs0, String cs1) {
        switch (cs0) {
            case 0:
                if (matrix[0].equals(cs1)) {
                    if (matrix[1].equals(cs1)) {
                        if (matrix[2].equals(cs1)) {
                            return true;
                        }
                    }
                    if (matrix[3].equals(cs1)) {
                        if (matrix[6].equals(cs1)) {
                            return true;
                        }
                    }
                    if (matrix[4].equals(cs1)) {
                        if (matrix[8].equals(cs1)) {
                            return true;
                        }
                    }
                }
                break;
            case 1:
                if (matrix[1].equals(cs1)) {
                    if (matrix[0].equals(cs1)) {
                        if (matrix[2].equals(cs1)) {
                            return true;
                        }
                    }
                    if (matrix[4].equals(cs1)) {
                        if (matrix[7].equals(cs1)) {
                            return true;
                        }
                    }
                }
                break;
            case 2:
                if (matrix[2].equals(cs1)) {
                    if (matrix[5].equals(cs1)) {
                        if (matrix[8].equals(cs1)) {
                            return true;
                        }
                    }
                    if (matrix[4].equals(cs1)) {
                        if (matrix[6].equals(cs1)) {
                            return true;
                        }
                    }
                    if (matrix[0].equals(cs1)) {
                        if (matrix[1].equals(cs1)) {
                            return true;
                        }
                    }
                }
                break;
            case 3:
                if (matrix[3].equals(cs1)) {
                    if (matrix[0].equals(cs1)) {
                        if (matrix[6].equals(cs1)) {
                            return true;
                        }
                    }
                    if (matrix[4].equals(cs1)) {
                        if (matrix[5].equals(cs1)) {
                            return true;
                        }
                    }
                }
                break;
            case 4:
                if (matrix[4].equals(cs1)) {
                    if (matrix[3].equals(cs1)) {
                        if (matrix[5].equals(cs1)) {
                            return true;
                        }
                    }
                    if (matrix[1].equals(cs1)) {
                        if (matrix[7].equals(cs1)) {
                            return true;
                        }
                    }
                }
                break;
            case 5:
                if (matrix[5].equals(cs1)) {
                    if (matrix[2].equals(cs1)) {
                        if (matrix[8].equals(cs1)) {
                            return true;
                        }
                    }
                    if (matrix[3].equals(cs1)) {
                        if (matrix[4].equals(cs1)) {
                            return true;
                        }
                    }
                }
                break;
            case 6:
                if (matrix[6].equals(cs1)) {
                    if (matrix[0].equals(cs1)) {
                        if (matrix[3].equals(cs1)) {
                            return true;
                        }
                    }
                    if (matrix[7].equals(cs1)) {
                        if (matrix[8].equals(cs1)) {
                            return true;
                        }
                    }
                    if (matrix[4].equals(cs1)) {
                        if (matrix[2].equals(cs1)) {
                            return true;
                        }
                    }
                }
                break;
            case 7:
                if (matrix[7].equals(cs1)) {
                    if (matrix[6].equals(cs1)) {
                        if (matrix[8].equals(cs1)) {
                            return true;
                        }
                    }
                    if (matrix[1].equals(cs1)) {
                        if (matrix[4].equals(cs1)) {
                            return true;
                        }
                    }
                }
                break;
            case 8:
                if (matrix[8].equals(cs1)) {
                    if (matrix[6].equals(cs1)) {
                        if (matrix[7].equals(cs1)) {
                            return true;
                        }
                    }
                    if (matrix[2].equals(cs1)) {
                        if (matrix[5].equals(cs1)) {
                            return true;
                        }
                    }
                    if (matrix[4].equals(cs1)) {
                        if (matrix[0].equals(cs1)) {
                            return true;
                        }
                    }
                }
                break;
        }

        return false;
    }

    private static void TicTacToe() {
        System.out.println("O X X\nO X O\nX O X\n");
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
