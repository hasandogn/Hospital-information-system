package com.microserviceproject.hrservice.resources;

import com.microserviceproject.hrservice.model.Employee;
import com.microserviceproject.hrservice.model.EmployeeList;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/hr")
public class HrResources {

    List<Employee> employees = Arrays.asList(
            new Employee("1", "Ahmet", "Ela", "Acil"),
            new Employee("2", "Musab", "Basaran", "Ameliyathane"),
            new Employee("3", "Ali", "Dogan", "Acil")
    );

    @RequestMapping("/employees")
    public ResponseEntity<EmployeeList> getEmployees() {
        EmployeeList employeeList = new EmployeeList();
        employeeList.setEmployees(employees);
        return ResponseEntity.ok(employeeList);
    }

    @RequestMapping("/employees/{Id}")
    public Employee getEmployeeById(@PathVariable("Id") String Id) {
        Employee e = employees.stream()
                .filter(employee -> Id.equals(employee.getId()))
                .findAny()
                .orElse(null);

        return e;
    }


}
