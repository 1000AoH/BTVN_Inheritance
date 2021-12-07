package com.company;

import java.util.ArrayList;

public class Tester extends  Staff {
    private int errors;
    private long salary;
    ArrayList<Tester> testers = new ArrayList<Tester>();
    public Tester(){}
    public Tester(String code, String name, String email, String phoneNumber, long baseSalary, int errorFound) {
        super(code, name, email, phoneNumber, baseSalary);
        this.errors = errorFound;
    }

    public void addStaff(Tester tester) {
        testers.add(tester);
    }

    public void setSalary(long salary) {
        this.salary = super.getBaseSalary() + this.errors*50000;
    }

    @Override
    public String toString() {
        return "Tester{" + super.toString() +
                ", errors=" + errors +
                ", salary=" + salary +
                '}' +"\n";
    }

    public ArrayList<Tester> getTesters() {
        return testers;
    }
}
