package org.ikgroup.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.ikgroup.domain.Employee;



public interface EmployeeService extends Serializable{
	
	public List<Employee> findAll(Map<String, Object> map);
	
	public Employee findById(String id);
	
	public void save(Employee emp);

}
