package com.college.factory;

import com.college.domain.Employee;

public class EmployeeFactory {
    // Create Employee
    public static Employee createEmployee(int employeeId, String employeeName, String employeeSurname, String employeeRole) {
        return new Employee.EmployeeBuilder()
                .setEmployeeId(employeeId)
                .setEmployeeName(employeeName)
                .setEmployeeSurname(employeeSurname)
                .setEmployeeRole(employeeRole)
                .build();

    }
}
