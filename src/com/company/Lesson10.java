package com.company;

import java.util.Scanner;

public class Lesson10 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
        ex6();
    }

    private static void ex6() {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double p = (a + b + c) / 2.0;
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println(s);
    }

    private static void ex5() {
        int count = 0;
        for (Secret e : Secret.values()) {
            if (e.name().startsWith("STAR")) {
                count++;
            }
        }
        System.out.println(count);
    }

    private static void ex4() {
        for (DangerLevel value : DangerLevel.values()) {
            System.out.println(value.name() + " " + value.getLevel());
        }
    }

    private static void ex3() {
        for (Currency value : Currency.values()) {
            System.out.println(value.name());
        }
    }

    private static void ex2() {
        Scanner scanner = new Scanner(System.in);
        String val = scanner.nextLine();
        Long longVal = "null".equals(val) ? null : Long.parseLong(val);
        System.out.println(convert(longVal));
    }

    public static int convert(Long val) {
        if (val == null) {
            return 0;
        }
        if (val > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (val < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return val.intValue();
    }

    private static void ex1() {
        System.out.println(Primitive.toPrimitive(null));
        System.out.println(Primitive.toPrimitive(true));
        System.out.println(Primitive.toPrimitive(false));
    }
}

enum Secret {
    STAR, CRASH, START, CONTINUE, MEDIEVAL, STARTRACK, SUPERMAN, MARGARIN, STARTER, STARIK, STARPIOR
}

enum DangerLevel {
    HIGH(3),
    MEDIUM(2),
    LOW(1);
    private final int dangerLevel;

    DangerLevel(int dangerLevel) {
        this.dangerLevel = dangerLevel;
    }

    public int getLevel() {
        return dangerLevel;
    }
}

enum Currency {
    USD, EUR, GBP, RUB, UAH, KZT, CAD, JPY, CNY
}

class Primitive {
    public static boolean toPrimitive(Boolean b) {
        return b != null && b;
    }
}