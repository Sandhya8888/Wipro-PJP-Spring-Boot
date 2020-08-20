package com.wipro.pack;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService s;

	@PostMapping("/createEmployee")
	public Employee createEmployee(Employee e) {
		return s.save(e);
	}
	
	@GetMapping("/getEmployees")
	public List<Employee> getEmployees(){
		return s.getAllEmployees();
	}
	
	@GetMapping("/getEmployee/{id}")
	public Optional<Employee> getEmployee(@PathVariable("id") Integer id){
		return s.getEmployeeById(id);
	}
	
	@PutMapping("/updateEmployee")
	public Employee updateEmployee(Employee e) {
		return s.save(e);
	}
	
	@DeleteMapping("/deleteEmployee/{id}")
	public void deleteEmployee(@PathVariable("id")Integer id){
		s.deleteById(id);
	}
}
