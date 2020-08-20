package com.wipro.pack;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService s;
	
	@RequestMapping(value="/home")
	public String Home() {
		return "Home";
	}
	@RequestMapping(value="/register")
	public String R(@ModelAttribute("Employee")Employee e,ModelMap model) {
		return "Register";
	}
	@RequestMapping(value="/add")
	public String A(@ModelAttribute("Employee")Employee e,ModelMap model) {
		s.save(e);
		ArrayList<Employee> a1=new ArrayList<Employee>();
		a1.add(e);
		String m="Inserted successfully";
		model.addAttribute("list",a1);
		model.addAttribute("msg",m);
		return "Add";
		
	}
	@RequestMapping(value="/delete")
	public String D(@ModelAttribute("Employee")Employee e,ModelMap model) {
		model.addAttribute("Employee", new Employee());
		return "Delete";
		
	}
	@RequestMapping(value="/deleteEmp")
	public String D1(@ModelAttribute("Employee")Employee e,ModelMap model) {
		boolean a = s.empExists(e.getId());
		if(a) {
			Employee e1=new Employee();
			e1=s.getEmployeeById(e.getId());
			ArrayList<Employee> a1=new ArrayList<Employee>();
			a1.add(e1);
			model.addAttribute("list",a1);
			return "Delete2";
			}
		else {
			String msg="No employee exists with that id";
			model.addAttribute("msg",msg);
			return "Delete";
		}
		
	}
	@RequestMapping(value="/deleteEmp2")
	public String D2(@RequestParam("id") String id,@ModelAttribute("Employee")Employee e,ModelMap model) {
		int i=Integer.parseInt(id);
		s.deleteById(i);
		return "Deleted";
		
	}
	@RequestMapping(value="/modify")
	public String M(@ModelAttribute("Employee")Employee e,ModelMap model) {
		model.addAttribute("Employee", new Employee());
		return "Modify";
		
	}
	@RequestMapping(value="/edit")
	public String M1(@ModelAttribute("Employee")Employee e,ModelMap model) {
		boolean a = s.empExists(e.getId());
		if(a) {
			Employee e1=new Employee();
			e1=s.getEmployeeById(e.getId());
			ArrayList<Employee> a1=new ArrayList<Employee>();
			a1.add(e1);
			model.addAttribute("list",a1);
			model.addAttribute("Employee", new Employee());
			return "Edit";
			}
		else {
			String msg="No employee exists with that id";
			model.addAttribute("msg",msg);
			return "Modify";
		}
		
	}
	@RequestMapping(value="/update")
	public String M2(@RequestParam Map<?,?> r,@ModelAttribute("Employee")Employee e,ModelMap model) {
		String i=(String) r.get("id");
		int id=Integer.parseInt(i);
		s.Update(id,e,r);
		model.addAttribute("msg","Updated successfully");
			Employee e1=new Employee();
			e1=s.getEmployeeById(e.getId());
			ArrayList<Employee> a1=new ArrayList<Employee>();
			a1.add(e1);
			model.addAttribute("list",a1);
			return "Add";
		
	}
	@RequestMapping(value="/select")
	public String S(@ModelAttribute("Employee")Employee e,ModelMap model) {
		model.addAttribute("Employee", new Employee());
		return "Select";
		
	}
	@RequestMapping(value="/getEmp")
	public String S1(@ModelAttribute("Employee")Employee e,ModelMap model) {
		boolean a = s.empExists(e.getId());
		if(a) {
			Employee e1=new Employee();
			e1=s.getEmployeeById(e.getId());
			ArrayList<Employee> a1=new ArrayList<Employee>();
			a1.add(e1);
			model.addAttribute("list",a1);
			String msg="The employee details are:";
			model.addAttribute("msg",msg);
			return "Add";
			}
		else {
			String msg="No employee exists with that id";
			model.addAttribute("msg",msg);
			return "Select";
		}
		
	}
	@RequestMapping(value="/all")
	public String A1(@ModelAttribute("Employee")Employee e,ModelMap model) {
		List<Employee> list=s.getAllEmployees();
		if(list.isEmpty()) {
			String msg="No employee data inserted";
			model.addAttribute("msg",msg);
		}
		else {
			String msg="The employee details are:";
			model.addAttribute("msg",msg);
			model.addAttribute("list", list);
		}
		return "Add";
	}
}
