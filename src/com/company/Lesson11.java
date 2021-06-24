package com.company;

import javafx.scene.shape.Shape;

import java.util.Arrays;

public class Lesson11 {
    public static void main(String[] args) {
        ex3();
        ex4();
    }

    private static void ex4() {
        Shape2 shape = new Shape2();
        Circle circle = new Circle(8);
        Shape2 rectangle = new Rectangle(4, 5);
        Shape2 triangle = new Triangle(5, 4);
        Shape2 square = new Square(3);

        printAreaOfShape(circle);
        printAreaOfShape(triangle);
    }

    public static void printAreaOfShape(Shape2 shape) {
        System.out.println(shape.area());
    }

    private static void ex3() {
        String[] skills = { "git", "Scala", "JBoss", "UML" };
        Developer developer = new Developer("Mary", "mary@mail.com", 3, "Java", skills);
        System.out.println(developer.toString());
    }
}

// Ex1
class Doctor extends Employee {
}

class Employee2 extends Person {
}

class Patient2 extends Person {
}

class Person {
}

// Ex2
class BankAccount {
    protected String number;
    protected Long balance;

    public BankAccount(String number, Long balance) {
        this.number = number;
        this.balance = balance;
    }
}

class CheckingAccount extends BankAccount {
    double fee;

    public CheckingAccount(String number, Long balance, double fee) {
        super(number, balance);
        this.fee = fee;
    }
}

class SavingAccount extends BankAccount {
    double interestRate;

    public SavingAccount(String number, Long balance, double interestRate) {
        super(number, balance);
        this.interestRate = interestRate;
    }
}

// Ex3
class DataAnalyst extends Employee22 {
    private boolean phd;
    private String[] methods;

    public DataAnalyst(String name, String email, int experience, boolean phd, String[] methods) {
        super(name, email, experience);
        this.phd = phd;
        this.methods = methods;
    }

    public boolean isPhd() {
        return phd;
    }

    public String[] getMethods() {
        return methods;
    }
}

class Developer extends Employee22{
    private String mainLanguage;
    private String[] skills;

    public Developer(String name, String email, int experience, String mainLanguage, String[] skills) {
        super(name, email, experience);
        this.mainLanguage = mainLanguage;
        this.skills = skills;
    }

    public String getMainLanguage() {
        return mainLanguage;
    }

    public String[] getSkills() {
        return skills;
    }

    public String toString() {
        return "Name: "+ getName() + " Language: " + mainLanguage + ", skills: " + Arrays.toString(skills);
    }
}

class Employee22 {
    private String name;
    private String email;
    private int experience;

    public Employee22(String name, String email, int experience) {
        this.name = name;
        this.email = email;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getExperience() {
        return experience;
    }
}

class Circle extends Shape2 {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}


class Rectangle extends Shape2 {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}

class Shape2 extends Object {
    public double area() {
        return 0;
    }
}

class Square extends Shape2 {
    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return Math.pow(side, 2);
    }
}

class Triangle extends Shape2 {
    double height;
    double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public double area() {
        return height * base / 2;
    }
}