package com.company;

import java.util.Scanner;

public class Lesson12 {
    public static void main(String[] args) {
        ex1();
        ex11();
        ex2();
        ex3();
    }

    private static void ex3() {
        Vehicle truck = new Car("ABC125", 3);
        print(truck);
    }

    private static void print(Vehicle truck) {
        System.out.println(truck.toString());
    }

    private static void ex2() {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String[] arr = s.split("; ");

        switch (arr[0]) {
            case "Publication" :
                Publication publication = new Publication(arr[1]);
                System.out.println(publication.getInfo());
                break;
            case "Newspaper" :
                Newspaper np = new Newspaper(arr[1], arr[2]);
                System.out.println(np.getInfo());
                break;
            case "Article" :
                Article art = new Article(arr[1], arr[2]);
                System.out.println(art.getInfo());
                break;
            case "Announcement" :
                Announcement ann = new Announcement(arr[1], Integer.parseInt(arr[2]));
                System.out.println(ann.getInfo());
                break;
        }
    }

    private static void ex11() {
        new Programmer(1);
    }

    private static void ex1() {
        new Programmer(1);
    }
}

class Vehicle {
    protected String licensePlate;

    public Vehicle(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "licensePlate='" + licensePlate + '\'' +
                '}';
    }
}

class Truck extends Vehicle {
    private int tons;

    public Truck(String licensePlate, int tons) {
        super(licensePlate);
        this.tons = tons;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "tons=" + tons +
                ", licensePlate='" + licensePlate + '\'' +
                '}';
    }
}

class Car extends Vehicle {
    protected int numberOfSeats;

    public Car(String licensePlate, int numberOfSeats) {
        super(licensePlate);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfSeats=" + numberOfSeats +
                ", licensePlate='" + licensePlate + '\'' +
                '}';
    }
}

class Publication {
    private String title;

    public Publication(String title) {
        this.title = title;
    }

    public final String getInfo() {
        return getType() + getDetails() + ": " + getTitle();
    }

    public String getType() {
        return "Publication";
    }

    public String getDetails() {
        return "";
    }

    public String getTitle() {
        return title;
    }
}

class Newspaper extends Publication {

    private String source;

    public Newspaper(String title, String source) {
        super(title);
        this.source = source;
    }

    public String getType() {
        return "Newspaper";
    }

    public String getDetails() {
        return " (source - " + source + ")";
    }
}

class Article extends Publication {
    private String author;

    public Article(String title, String author) {
        super(title);
        this.author = author;
    }

    public String getType() {
        return "Article";
    }

    public String getDetails() {
        return " (author - " + author + ")";
    }
}

class Announcement extends Publication {
    private int daysToExpire;

    public Announcement(String title, int daysToExpire) {
        super(title);
        this.daysToExpire = daysToExpire;
    }

    public String getType() {
        return "Announcement";
    }

    public String getDetails() {
        return " (days to expire - " + daysToExpire + ")";
    }
}

class Programmer3 extends TeamLead {
    private int numProgrammer;

    public Programmer3(int numProgrammer) {
        super(numProgrammer);
        this.numProgrammer = numProgrammer;
        employ();
    }

    protected void employ() {
        System.out.println(numProgrammer + " programmer");
    }
}

class TeamLead3 {
    private int numTeamLead;

    public TeamLead3(int numTeamLead) {
        this.numTeamLead = numTeamLead;
        employ();
    }

    private void employ() {
        System.out.println(numTeamLead + " teamlead");
    }
}

class Programmer extends TeamLead {
    private int numProgrammer;

    public Programmer(int numProgrammer) {
        super(numProgrammer);
        this.numProgrammer = numProgrammer;
        employ();
    }

    protected void employ() {
        System.out.println(numProgrammer + " programmer");
    }
}

class TeamLead {
    private int numTeamLead;

    public TeamLead(int numTeamLead) {
        this.numTeamLead = numTeamLead;
        employ();
    }

    protected void employ() {
        System.out.println(numTeamLead + " teamlead");
    }
}
