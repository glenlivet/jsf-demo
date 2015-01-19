package org.ikgroup.persistence;

import java.util.List;
import java.util.Map;

import org.ikgroup.domain.Employee;

public interface EmployeeMapper {
	
	public void insert(Employee employee);
	
	public void update(Employee employee);
	
	public List<Employee> findAll(Map<String, Object> params);
	
	public Employee findById(String id);
	
	public void delete(String id);
	
	public Long getTotal();

}
