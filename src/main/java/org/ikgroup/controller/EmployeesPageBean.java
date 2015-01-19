package org.ikgroup.controller;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;
import javax.inject.Named;

import org.ikgroup.domain.Employee;
import org.ikgroup.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;


@Named
@Scope("view")
public class EmployeesPageBean implements Serializable {
	
	static Logger logger = LoggerFactory.getLogger(EmployeesPageBean.class);

	private static final long serialVersionUID = 8234520003120853360L;
	
	@Inject
	@Named("employeeService")
	private EmployeeService empServ;
	
	private List<Employee> employees;
	
	private Employee formObject = new Employee();
	
	private Map<String, Object> query = new HashMap<String, Object>();
	
	@PostConstruct
	public void init(){
		employees = empServ.findAll(query);
	}
	
	public void doQuery(ActionEvent event){
		query.put("name", query.get("name")+ "%");
		employees = empServ.findAll(query);
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

	public Map<String, Object> getQuery() {
		return query;
	}

	public void setQuery(Map<String, Object> query) {
		this.query = query;
	}

	public Employee getFormObject() {
		return formObject;
	}

	public void setFormObject(Employee formObject) {
		this.formObject = formObject;
	}

}
