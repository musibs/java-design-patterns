package com.codefountain.design.patterns.creational.prototype;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws  CloneNotSupportedException{
        Employees employees = new Employees(Arrays.asList("John"));
        System.out.println(employees);
        employees.getEmployeeList().add("Doe");
        System.out.println(employees.clone());
    }
}
