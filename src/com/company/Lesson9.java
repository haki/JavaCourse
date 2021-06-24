package com.company;

public class Lesson9 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
        ex6();
        ex7();
    }

    private static void ex7() {
        //        System.out.println(Cat.getNumberOfCats());
//        Cat c1 = new Cat("Maia", 3);
//        System.out.println(Cat.getNumberOfCats());
//        Cat c2 = new Cat("Europa", 13);
//        System.out.println(Cat.getNumberOfCats());
//        Cat c3 = new Cat("Asia", 10);
//        System.out.println(Cat.getNumberOfCats());
//        Cat c4 = new Cat("America", 8);
//        System.out.println(Cat.getNumberOfCats());
//
//
//        Cat c5 = new Cat("America", 8);
//        Cat c6 = new Cat("America", 8);
//        System.out.println(Cat.getNumberOfCats());
//        System.out.println(c3.toString());
    }

    private static void ex6() {
        System.out.println(ConstantsAndUtilities.A_CONSTANT_TTT);
        System.out.println(ConstantsAndUtilities.B_CONSTANT_QQQ);
        System.out.println(ConstantsAndUtilities.getMagicString());
        System.out.println(ConstantsAndUtilities.convertStringToAnotherString("aa"));
    }

    private static void ex5() {
        User1 u1 = new User1();
        u1.setFirstName("Alex");
        u1.setLastName("Macedon");

        User1 u2 = new User1();
        u2.setFirstName("Maria");
        u2.setLastName(null);


        User1 u3 = new User1();
        u3.setFirstName(null);
        u3.setLastName("Smith");

        User1 u4 = new User1();
        u4.setFirstName(null);
        u4.setLastName(null);

        System.out.println(u1.getFullName());
        System.out.println(u2.getFullName());
        System.out.println(u3.getFullName());
        System.out.println(u4.getFullName());
    }

    private static void ex4() {
        Account1 acc = new Account1();
        acc.setOwnerName("Alex");
        acc.setBalance(10000000);
        acc.setLocked(true);

        String locked = acc.isLocked() ? "lock" : "not locked";

        System.out.println(acc.getOwnerName() + " has " + acc.getBalance() + " and account is " + locked);

        System.out.println(Math.PI * 3.14);
    }

    private static void ex3() {
        Clock c = new Clock();//12:00
        c.display();
        c.next();//12:01
        c.display();
        System.out.println();
        Clock c2 = new Clock(11, 59);//11:59
        c2.display();
        c2.next();//12:01
        c2.display();
    }

    private static void ex2() {
        Patient1 p1 = new Patient1("Alex");
        p1.say();

        Patient1 p2 = new Patient1("Maria");
        p2.say();
    }

    private static void ex1() {
        Counter c = new Counter(10);
        System.out.println(c.getCurrent());
        c.inc();
        c.inc();
        System.out.println(c.getCurrent());
        c.inc();
        c.inc();
        System.out.println(c.getCurrent());
    }
}

class Counter {
    private int current;

    public Counter(int current) {
        this.current = current;
    }

    public void inc() {
        current++;
    }

    public int getCurrent() {
        return current;
    }
}

class Patient1 {
    private static String name;
    private static String[] names = new String[10];

    public Patient1(String name) {
        this.name = name;
    }

    public void say() {
        System.out.println("Hello, my name is " + name + ", I need a doctor.");
    }
}

class Clock {
    private int hours;
    private int minutes;

    public Clock() {
        this(12, 0);
    }

    public Clock(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    void next() {
        minutes++;
        if (minutes == 60) {
            minutes = 0;
            hours++;
            if (hours == 13) {
                hours = 1;
            }
        }
    }

    void display() {
        System.out.printf("%02d:%02d%n", this.hours , this.minutes);
    }
}

class Account1 {
    private long balance;
    private String ownerName;
    private boolean locked;

    public long getBalance() {
        return balance;
    }

    public boolean isLocked() {
        return locked;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setBalance(long value) {
        balance = value;
    }

    public void setOwnerName(String value) {
        ownerName = value;
    }

    public void setLocked(boolean value) {
        locked = value;

    }
}

class User1 {
    private String firstName;
    private String lastName;

    public User1() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? "" : firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName == null ? "" : lastName;
    }

    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "Unknown";
        }
        else if (firstName.isEmpty() || lastName.isEmpty()) {
            return lastName.isEmpty() ? firstName : lastName;
        }
        return firstName + " " + lastName;
    }
}

class ConstantsAndUtilities {
    public static final String A_CONSTANT_TTT = "1234";

    public static final String B_CONSTANT_QQQ = "7890";

    public static String getMagicString() {
        return A_CONSTANT_TTT + B_CONSTANT_QQQ;
    }

    public static String convertStringToAnotherString(String s) {
        return A_CONSTANT_TTT + s;
    }
}

class Cat {
    private String name;
    private int age;
    private static int counter = 0;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        counter++;
        if (counter > 5) {
            System.out.println("You have too many cats");
        }
    }

    public static int getNumberOfCats() {
        return counter;
    }

    public String toString() {
        return name + " " + age;
    }
}

enum ChargeLevel {
    FULL, HIGH, MEDIUM, LOW
}