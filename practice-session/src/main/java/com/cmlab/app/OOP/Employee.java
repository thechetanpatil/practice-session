package com.cmlab.app.OOP;

import lombok.*;

import java.util.Objects;

public class Employee {

    private int id;

    private String fname;

    private String lname;

    private String deptId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public Employee(int id, String fname, String lname, String deptId) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.deptId = deptId;
    }

    public Employee() {
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(fname, employee.fname) && Objects.equals(lname, employee.lname) && Objects.equals(deptId, employee.deptId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fname, lname, deptId);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", deptId='" + deptId + '\'' +
                '}';
    }
}
