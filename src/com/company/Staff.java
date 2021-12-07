package com.company;

import java.util.ArrayList;

public class Staff {
    private String code, name, email, phoneNumber;
    private long baseSalary;
    ArrayList<Staff> staff = new ArrayList<Staff>();
    public Staff(){

    }
    public Staff(String code, String name, String email, String phoneNumber, long baseSalary) {
        this.code = code;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.baseSalary = baseSalary;
    }

    public void addStaff(Staff newStaff){
        staff.add(newStaff);
    }
    @Override
    public String toString() {
        return
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", baseSalary=" + baseSalary + '\'' ;
    }

    public long getBaseSalary() {
        return baseSalary;
    }
}
