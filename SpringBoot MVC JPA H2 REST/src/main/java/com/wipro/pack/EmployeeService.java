package com.wipro.pack;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository e;
	
	public List<Employee> getAllEmployees(){
		List<Employee> l=new ArrayList<Employee>();
		e.findAll().forEach(i->l.add(i));
		return l;
	}
	public Optional<Employee> getEmployeeById(int id)   
	{  
	return Optional.of(e.findById(id).get());
	}  
	public void deleteById(int id)   
	{  
		e.deleteById(id);
	}  
	public boolean empExists(int id)   
	{  
		if(e.existsById(id)) {
			return true;
		}
		else {
			return false;
		}
	}
	public Employee save(Employee e2) {
		return e.save(e2);
		
	} 
}
