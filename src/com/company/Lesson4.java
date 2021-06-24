package com.company;

import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
        ex6();
        ex7();
        ex8();
        ex9();
        ex10();
        ex11();
        ex12();
    }

    private static void ex12() {
        System.out.println("It compiles!"); // It prints "It compiles!"
    }

    private static void ex11() {
        System.out.print("Hello, ");
        /*System.out.print("world");
        //System.out.print(" and ");*/
        System.out.print("Java");
        System.out.print(" platform");
    }

    private static void ex10() {
        while(true) {

        }
    }

    private static void ex9() {
        Scanner sc = new Scanner(System.in);
        int in;
        int count = 0;
        do {
            in = sc.nextInt();
            if (in != 0) {
                count++;
            }
        } while (in != 0);
        System.out.println(count);
    }

    private static void ex8() {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();//1
        int e = sc.nextInt();//3

        long res = 1;
        for (int i = b; i < e; i++) {
            res *= i;
        }
        System.out.println(res);
    }

    private static void ex7() {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();//8
        int e = sc.nextInt();//16

        for (int i = b; i <= e; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    private static void ex6() {
        Scanner sc = new Scanner(System.in);
        int dir = sc.nextInt();

        String st = "move ";
        switch (dir) {
            case 1:
                st += "up";
                break;
            case 2:
                st += "down";
                break;
            case 3:
                st += "left";
                break;
            case 4:
                st += "right";
                break;
            case 0:
                st = "do not " + st;
                break;
            default:
                st = "error!";
        }

        System.out.println(st);
    }

    private static void ex5() {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        double a, b, c;

        switch (type) {
            case "triangle":
                a = sc.nextDouble();
                b = sc.nextDouble();
                c = sc.nextDouble();
                double s = (a + b + c) / 2;
                double x = s * (s - a) * (s - b) * (s - c);
                System.out.println(Math.sqrt(x));
                break;
            case "rectangle":
                a = sc.nextDouble();
                b = sc.nextDouble();
                System.out.println(a * b);
                break;
            case "circle":
                double r = sc.nextDouble();
                System.out.println(3.14 * Math.pow(r, 2));
                break;
            default:
                System.out.println("Figure " + type + " is not yet supported!");
        }
    }

    private static void ex4() {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();

        switch (st) {
            case "gryffindor":
                System.out.println("bravery");
                break;
            case "hufflepuff":
                System.out.println("loyalty");
                break;
            case "slytherin":
                System.out.println("cunning");
                break;
            case "ravenclaw":
                System.out.println("intellect");
                break;
            default:
                System.out.println("not a valid house");
        }
    }

    private static void ex3() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        if (k <= n * m && (k % n == 0 && k >= n || k % m == 0 && k >= m)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static void ex2() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a < 1) {
            System.out.println("no army");
        } else if (a <= 19) {
            System.out.println("pack");
        } else if (a <= 249) {
            System.out.println("throng");
        } else if (a <= 999) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }
    }

    private static void ex1() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();//8
        int b = sc.nextInt();//10
        int h = sc.nextInt();

        if (h >= a && h <= b) {
            System.out.println("Normal");
        } else if (h < a) {
            System.out.println("Deficiency");
        } else {
            System.out.println("Excess");
        }
    }
}
