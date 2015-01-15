package org.ikgroup.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.ikgroup.domain.Employee;
import org.ikgroup.service.EmployeeService;
import org.springframework.context.annotation.Scope;


@Named
@Scope("view")
public class EmployeesPageBean implements Serializable {

	private static final long serialVersionUID = 8234520003120853360L;
	
	@Inject
	@Named("employeeService")
	private EmployeeService empServ;
	
	private List<Employee> employees;
	
	@PostConstruct
	public void init(){
		employees = empServ.findAll();
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public void setEmpServ(EmployeeService empServ) {
		this.empServ = empServ;
	}

}
