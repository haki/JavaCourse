package com.company;

import java.util.Scanner;

public class Lesson6 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex51();
        ex52();
        ex6();
    }

    private static void ex6() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String res = String.valueOf(str.charAt(0));
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i-1) == str.charAt(i)) {
                count++;
            } else {
                res += count + String.valueOf(str.charAt(i));
                count = 1;
            }
        }
        res += count;
        System.out.println(res);
    }

    private static void ex52() {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        String st = sc.nextLine();

        int count = 0;
        int pos = 0;

        for (int i = 0; i < in.length(); i++) {
            if (in.charAt(i) == st.charAt(pos)) {
                pos++;
                if (pos == st.length()) {
                    count++;
                    pos = 0;
                }
            }
            else {
                pos = 0;
            }
        }
        System.out.println(count);
    }

    private static void ex51() {
        Scanner sc = new Scanner(System.in);
        String write = sc.nextLine();
        String litresFind = sc.nextLine();
        System.out.println(write.split(litresFind, -1).length - 1);
    }

    private static void ex4() {
        Scanner sc = new Scanner(System.in);
        String unformattedDate = sc.nextLine();

        String[] dateArray = unformattedDate.split("-");
        String formattedDate = dateArray[1] + "/" + dateArray[2] + "/" + dateArray[0];
        System.out.println(formattedDate);
    }

    private static void ex3() {
        Scanner sc = new Scanner(System.in);
        String st1 = sc.nextLine();
        String st2 = sc.nextLine();

        st1 = st1.replace(" ", "").trim();
        st2 = st2.replace(" ", "").trim();

        System.out.println(st1.equals(st2));
    }

    private static void ex2() {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println(st.endsWith("burg"));
    }

    private static void ex1() {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println(st.replace("a", "b"));
    }
}
