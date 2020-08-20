package com.wipro.pack;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
	public Employee getEmployeeById(int id)   
	{  
	return e.findById(id).get();
	}  
	public void Update(int id, Employee e1, Map<?, ?> r)   
	{  
		Employee e2=getEmployeeById(id);
		e2.setName((String) r.get("name"));
		e2.setGender((String) r.get("gender"));
		e2.setDesignation((String) r.get("designation"));
		e2.setSalary(Integer.parseInt((String) r.get("salary")));
		e2.setCity((String) r.get("city"));
		e2.setEmail((String) r.get("email"));
		BigInteger mobile=new BigInteger((String)r.get("mobile"));
		e2.setMobile(mobile);
		e.save(e2);
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
	public void save(Employee e2) {
		e.save(e2);
		
	} 
}
