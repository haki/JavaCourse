package com.company;

import java.util.Optional;
import java.util.Scanner;

public class Lesson8 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
        ex6();
        ex7();
        // ex8 = create "Employer" class
        ex9();
    }

    private static void ex9() {
        final Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        firstName = "null".equals(firstName) ? null : firstName;

        String lastName = scanner.nextLine();
        lastName = "null".equals(lastName) ? null : lastName;

        System.out.println(prepareFullName(firstName, lastName));
    }

    public static String prepareFullName(String firstName, String lastName) {
        String result = "";
        if (firstName != null) {
            result += firstName;
            if (lastName != null) {
                result += " ";
            }
        }
        if (lastName != null) {
            result += lastName;
        }
        return result;
    }

    private static void ex7() {
        User user = new User("demo-user", "Alexander", "Schmidt");
        Account acc = new Account("123456", 1000, user);

        process(acc);
    }

    public static void process(Account account) {
        try {
            final Optional<User> owner = Optional.ofNullable(account.getOwner());

            System.out.println(account.getCode());
            System.out.println(account.getBalance());

            owner.ifPresent(o -> {
                System.out.println(o.getLogin());
                System.out.println(o.getFirstName());
                System.out.println(o.getLastName());
            });

        } catch (Exception e) {
            System.out.println("Something wrong...");
        }
    }

    private static void ex6() {
        // Create class and add constructor in Book
    }

    private static void ex2() {
        // Create class "Complex" and add var.
    }

    private static void ex5() {
        // Add constructor in "Complex"
    }

    private static void ex4() {
        int size = 10;
        int[] arr = new int[size];

        java.util.Scanner sc = new java.util.Scanner(System.in);



        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int search = sc.nextInt();


        java.util.Arrays.sort(arr);

        int result = java.util.Arrays.binarySearch(arr, search);

        System.out.println(result);
    }

    private static void ex3() {
        Box box = new Box();
        box.length = 20;
        box.height = 10;
        box.width = 15;

        box.innerBox = new Box();
        box.innerBox.length = 5;
        box.innerBox.height = 2;
        box.innerBox.width = 2;

//        Box myInnerBox = new Box();
//        myInnerBox.length = 5;
//        myInnerBox.height = 2;
//        myInnerBox.width = 2;
//        box.innerBox = myInnerBox;
    }

    private static void ex1() {
        Account acc = new Account();
    }
}

class User {
    private String login;
    private String firstName;
    private String lastName;

    public User(String login, String firstName, String lastName) {
        this.login = login;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getLogin() {
        return login;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

class Book {
    String title;
    int yearOfPublishing;
    String[] authors;

    public Book(String t, int y, String[] a) {
        title = t;
        yearOfPublishing = y;
        authors = java.util.Arrays.copyOf(a, a.length);
    }
}

class Account {
    private String code;
    private long balance;
    private User owner;

    public Account(String code, long balance, User owner) {
        this.code = code;
        this.balance = balance;
        this.owner = owner;
    }

    public Account() {

    }

    public String getCode() {
        return code;
    }

    public long getBalance() {
        return balance;
    }

    public User getOwner() {
        return owner;
    }
}

class Complex {
    double real;
    double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
}

class Box {
    double length;
    double height;
    double width;
    Box innerBox;
}

class Employee {
    String name;
    int salary;
    String address;

    Employee() {
        this("unknown",0 ,"unknown");
    }

    Employee(String name, int salary) {
        this(name, salary, "unknown");
    }

    Employee(String name, int salary, String address) {
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
}
