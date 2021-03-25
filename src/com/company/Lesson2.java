package com.company;

public class Lesson2 {
    public static void main(String[] args) {
        Assigments();
        InvalidDeclarationOfVariables();
        FillTheDeclaration();
    }

    private static void FillTheDeclaration() {
        int variable = 123456;
        System.out.println(variable);
    }

    private static void InvalidDeclarationOfVariables() {
        int a = 512343;
        int b = 3431231;

        System.out.println(a+b);
    }

    private static void Assigments() {
        int a = 3;
        int b = 5;
        int c = 4;

        System.out.println(a + " " + b + " " + c);
    }
}
