package com.company;

import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        //ReadingIntegerNumbers();
        //HowManyNutsEachSquirrelWillGet();
        //TheSumOfDigits();
        //Snail();
        //Distance();
        //DifferenceBetweenTwoDoubles();
        //CheckTheValue();
        //CheckTheGivenNumbersAreDifferent();
        ExactlyOneParameterIsPositive();
    }

    private static void ExactlyOneParameterIsPositive() {
        Scanner scanner = new Scanner(System.in);
        int[] n = new int[3];

        System.out.print("Nums: ");
        for (int i = 0; i < 3; i++) {
            n[i] = scanner.nextInt();
        }

        boolean res = false;

        if ((n[0] >= 1 && n[1] <= 0 && n[2] <= 0) || (n[1] >= 1 && n[0] <= 0 && n[2] <= 0) || (n[2] >= 1 && n[1] <= 0 && n[0] <= 0)) {
            res = true;
        }

        System.out.println(res);
    }

    private static void CheckTheGivenNumbersAreDifferent() {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[3];

        System.out.println("Numbers: ");
        for (int i = 0; i < 3; i++) {
            nums[i] = scanner.nextInt();
        }

        if ((nums[0] == nums[1]) || (nums[0] == nums[2]) || (nums[1] == nums[2])) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }

    private static void CheckTheValue() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Num: ");
        int num = scanner.nextInt();

        if (num > 0 && num < 10) {
            System.out.println(true);
        } else
            System.out.println(false);
    }

    private static void DifferenceBetweenTwoDoubles() {
        Scanner scanner = new Scanner(System.in);
        double[] doubles = new double[2];

        System.out.print("Num 1: ");
        doubles[0] = scanner.nextDouble();

        System.out.print("Num 2: ");
        doubles[1] = scanner.nextDouble();

        System.out.println("Result: " + (doubles[0]-doubles[1]));
    }

    private static void Distance() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Distance: ");
        float distace = scanner.nextFloat();

        System.out.print("Hour: ");
        float hour = scanner.nextFloat();

        System.out.println("Result: " + distace/hour);
    }

    private static void Snail() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("H: ");
        int H = scanner.nextInt();

        System.out.print("A: ");
        int A = scanner.nextInt();

        System.out.print("B: ");
        int B = scanner.nextInt();

        while (true) {
            if (H > B && A > B) break;

            System.out.println("H and B need to be greather then A");
            System.out.print("H: ");
            H = scanner.nextInt();

            System.out.print("A: ");
            A = scanner.nextInt();

            System.out.print("B: ");
            B = scanner.nextInt();
        }

        System.out.println("Result: " + (1+(H-B-1)/(A-B)));
    }

    private static void TheSumOfDigits() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        int num = scanner.nextInt();

        while (true) {
            if (num >= 100 && num <= 999) break;

            System.out.print("Please type a num. greater then 100 and less then 999: ");
            num = scanner.nextInt();
        }

        int sum = 0;
        while (num != 0) {
            sum = sum + num%10;
            num = num/10;
        }

        System.out.println("Result: " + sum);
    }

    private static void HowManyNutsEachSquirrelWillGet() {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[2];

        System.out.print("Total Squirrels: ");
        nums[0] = scanner.nextInt();

        System.out.print("Total Nuts: ");
        nums[1] = scanner.nextInt();

        if (nums[0] < 0) {
            nums[0] = Math.abs(nums[0]);
        } else if (nums[1] < 0) {
            nums[1] = Math.abs(nums[1]);
        }

        while (true) {
            if (nums[0] <= 10000 && nums[1] <= 10000) break;

            if (nums[0] > 10000) {
                System.out.println("Please enter a number less than 10000 (Squirrels): ");
                nums[0] = scanner.nextInt();
            }
            if (nums[1] > 10000) {
                System.out.println("Please enter a number less than 10000 (Nuts): ");
                nums[1] = scanner.nextInt();
            }
        }

        System.out.println("Result: " + nums[1]/nums[0]);
    }

    private static void ReadingIntegerNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input: ");
        int[] nums = new int[4];
        for (int i = 0; i < 4; i++) {
            nums[i] = scanner.nextInt();
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(nums[i]);
        }
    }
}
