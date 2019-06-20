package com.codefountain.design.patterns.prototype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  Prototype design pattern
 *
 *  In this pattern objects are cloned from the
 *  base class. Base class generally does some expensive
 *  set up and get the data ready. The same data is
 *  passed onto the cloned objects (aka prototypes)
 */
public class Employees implements Cloneable {

    private List<String> employeeList = new ArrayList<>();

    public Employees() {
        String[] employeeArray = {"John", "Doe", "Smith", "Sonian"};
        employeeList.addAll(Arrays.asList(employeeArray));
    }

    public Employees(List<String> employeeList) {
        this.employeeList = new ArrayList<>(employeeList);
    }

    public List<String> getEmployeeList() {
        return employeeList;
    }

    @Override
    protected Employees clone() throws CloneNotSupportedException {
        List<String> tempEmployeeList = new ArrayList<>();
        for (String employee : this.employeeList) {
            tempEmployeeList.add(employee);
        }
        return new Employees(tempEmployeeList);
    }

    @Override
    public String toString() {
        return "Employees{" +
                "employeeList=" + employeeList +
                '}';
    }
}
