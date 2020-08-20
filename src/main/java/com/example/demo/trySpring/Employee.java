package com.example.demo.trySpring;

public class Employee {

    private int employeeId; //従業員ID

    public int getEmployeeId() {
        return employeeId;
    }

    public int getAge() {
        return age;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    private String employeeName; //従業員名
    private int age; //年齢
}
