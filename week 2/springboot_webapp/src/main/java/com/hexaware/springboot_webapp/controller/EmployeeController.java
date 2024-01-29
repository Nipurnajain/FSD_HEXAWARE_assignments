package com.hexaware.springboot_webapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hexaware.springboot_webapp.dao.IEmployeeDao;
import com.hexaware.springboot_webapp.entity.Employee;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/employees")
public class EmployeeController { // SERVLET

	@Autowired
	IEmployeeDao dao;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseBody
	public String addEmployee(HttpServletRequest request, HttpServletResponse response) {

		int eid = Integer.parseInt(request.getParameter("eid"));

		String ename = request.getParameter("ename");

		double salary = Double.parseDouble(request.getParameter("salary"));

		Employee emp = new Employee(eid, ename, salary);

		return dao.addEmployee(emp);

	}
	
	
	
	
//	@RequestMapping("/getall")
//	@ResponseBody
//	public List<Employee> getAllEmployees() {
//		
//		return dao.getAll();
//	}
	
	
	@RequestMapping("/getall")
	//@ResponseBody
	public String getAllEmployees(HttpSession session) {
		List<Employee> list =dao.getAll();
		session.setAttribute("emplist",list);
		return "displayAll";
	}
	
	
	@RequestMapping("/get")
	public String get() {        //returning view
		//success is page name inside the views folder
		return "success";               //     /view/success.jsp
	}
	
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	@ResponseBody
	public String updateEmployee(HttpServletRequest request) {

		int eid = Integer.parseInt(request.getParameter("eid"));

		String ename = request.getParameter("ename");

		double salary = Double.parseDouble(request.getParameter("salary"));

		Employee emp = new Employee(eid, ename, salary);

		return dao.updateEmployee(emp);

	}

	@RequestMapping("/delete")
	@ResponseBody
	public String delete(HttpServletRequest request) {
		
		int eid=Integer.parseInt(request.getParameter("eid"));
		return dao.delete(eid);
	}
	
	@RequestMapping("/search")       // http://localhost:8080/employees/search?eid=102    without creating forms
	@ResponseBody
	public Employee search(HttpServletRequest request) {
		
		int eid=Integer.parseInt(request.getParameter("eid"));
		return dao.search(eid);
	}
}
