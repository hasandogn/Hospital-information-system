package com.microserviceproject.admissionsservice.model;

import java.util.List;

public class EmployeeList {
    public List<Employee> employees;

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
