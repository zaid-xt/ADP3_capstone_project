package com.college.domain;

public class Employee {
    // Employee attribute
    private int employeeId;
    private String employeeName;
    private String employeeSurname;
    private String employeeRole;

    // Default Constructor
    public Employee () {

    }

    // Builder Employee
    public Employee (EmployeeBuilder builder) {
        this.employeeId = builder.employeeId;
        this.employeeName = builder.employeeName;
        this.employeeSurname = builder.employeeSurname;
        this.employeeRole = builder.employeeRole;
    }

    // Getters
    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeSurname() {
        return employeeSurname;
    }

    public String getEmployeeRole() {
        return employeeRole;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeSurname='" + employeeSurname + '\'' +
                ", employeeRole='" + employeeRole + '\'' +
                '}';
    }

    public static class EmployeeBuilder {
        private int employeeId;
        private String employeeName;
        private String employeeSurname;
        private String employeeRole;

        public EmployeeBuilder() {}

        public EmployeeBuilder(int employeeId, String employeeName, String employeeSurname, String employeeRole) {
            this.employeeId = employeeId;
            this.employeeName = employeeName;
            this.employeeSurname = employeeSurname;
            this.employeeRole = employeeRole;
        }

        // Builder Getters
        public EmployeeBuilder setEmployeeId(int employeeId) {
            this.employeeId = employeeId;
            return this;
        }

        public EmployeeBuilder setEmployeeName(String employeeName) {
            this.employeeName = employeeName;
            return this;
        }

        public EmployeeBuilder setEmployeeSurname(String employeeSurname) {
            this.employeeSurname = employeeSurname;
            return this;
        }

        public EmployeeBuilder setEmployeeRole(String employeeRole) {
            this.employeeRole = employeeRole;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }
}
