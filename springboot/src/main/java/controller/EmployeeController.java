package controller;

import entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import service.EmployeeService;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @GetMapping("/listallemp")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    // POST endpoint to add a new employee
    @PostMapping("/addemp")
    public void addEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
    }

}
