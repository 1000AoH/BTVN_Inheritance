package com.company;

public class Main {

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;

        Function.printListOptions();
        while (!quit) {
            System.out.println("Choose your option: ");
            choice = Function.scanner.nextInt();
            Function.scanner.nextLine();
            switch (choice) {
                case 0:
                    Function.printListOptions();
                    break;
                case 1:
                    Function.addProgrammer();
                    break;
                case 2:
                    Function.addTester();
                    break;
                case 3:
                    Function.printProgrammerList();
                    break;
                case 4:
                    Function.printTesterList();
                    break;
                case 5:
                    quit = true;
                    break;
            }
        }
    }


}
