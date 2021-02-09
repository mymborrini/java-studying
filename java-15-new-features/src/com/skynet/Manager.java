package com.skynet;

public non-sealed class Manager extends Person{

    private String employeeId;

    public Manager(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }
}
