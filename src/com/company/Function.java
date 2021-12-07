package com.company;

import java.util.Scanner;

public class Function {
    public static Scanner scanner = new Scanner(System.in);
    public static Programmer programmer = new Programmer();
    public static Tester tester = new Tester();

    public static void printTesterList() {
        System.out.println("Tester list:");
        System.out.println(tester.getTesters());
    }

    public static void printProgrammerList() {
        System.out.println("Programmer list:");
        System.out.println(programmer.getProgrammers());
    }

    public static void addTester() {
        System.out.println("Enter staff code: ");
        String code = scanner.nextLine();
        System.out.println("Enter staff name: ");
        String name = scanner.nextLine();
        System.out.println("Enter staff email: ");
        String email = scanner.nextLine();
        System.out.println("Enter staff phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter staff base salary: ");
        Long baseSalary = Long.parseLong(scanner.nextLine());
        System.out.println("Enter errors found: ");
        int errors = Integer.parseInt(scanner.nextLine()) ;
        tester.addStaff(new Tester(code,name,email,phoneNumber,baseSalary,errors));
    }

    public static void addProgrammer() {
        System.out.println("Enter staff code: ");
        String code = scanner.nextLine();
        System.out.println("Enter staff name: ");
        String name = scanner.nextLine();
        System.out.println("Enter staff email: ");
        String email = scanner.nextLine();
        System.out.println("Enter staff phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter staff base salary: ");
        Long baseSalary = Long.parseLong(scanner.nextLine());
        System.out.println("Enter overtime hours: ");
        int overtime = Integer.parseInt(scanner.nextLine()) ;
        programmer.addStaff(new Programmer(code,name,email,phoneNumber,baseSalary,overtime));
    }

    public static void printListOptions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print options.");
        System.out.println("\t 1 - To add Programmer to the list.");
        System.out.println("\t 2 - To add Tester to the list.");
        System.out.println("\t 3 - To print Programmer List to the list.");
        System.out.println("\t 4 - To print Tester List to the list.");
        System.out.println("\t 5 - To quit the program.");
    }
}
