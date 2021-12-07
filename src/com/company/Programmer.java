package com.company;

import java.util.ArrayList;

public class Programmer extends Staff{
    private int overtimeHours;
    private long salary;
    ArrayList<Programmer> programmers = new ArrayList<>();
    public Programmer(){}
    public Programmer(String code, String name, String email, String phoneNumber, long baseSalary, int overtimeHours) {
        super(code, name, email, phoneNumber, baseSalary);
        this.overtimeHours = overtimeHours;
        this.programmers = programmers;
    }

    @Override
    public String toString() {
        return "Programmer{" + super.toString() +
                ", overtimeHours=" + overtimeHours +
                ", salary=" + salary +
                '}' +"\n";
    }

    public void addStaff(Programmer newProgrammer) {
        programmers.add(newProgrammer);
    }

    public void setSalary(long salary) {
        this.salary = super.getBaseSalary() + this.overtimeHours*200_000l;
    }

    public ArrayList<Programmer> getProgrammers() {
        return programmers;
    }
}
