package com.cmlab.app.OOP.bank;

import com.cmlab.app.OOP.Employee;

public class EmployeeMain {

    public static void main(String[] args) {

        //Address from heap area where object is created in emp1 object
        Employee emp1 = new Employee(1, "chetan", "patil", "IT");

        Employee emp2 = new Employee(2, "abnc", "sdsd", "Sales");

        Employee emp3 = new Employee();

        int a = 10;

        System.out.println(emp1.getFname());

        System.out.println(emp2);

        System.out.println(emp3);

        emp3.setId(3);
        emp3.setFname("pqr");
        emp3.setLname("xyz");
        emp3.setDeptId("IT");

        System.out.println(emp3.toString());

    }
}
