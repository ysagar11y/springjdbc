package com.springjdbc.Dao;

import java.util.List;

import com.springjdbc.Entity.Employee;

public interface EmployeeDao {
	
	public void insert();
	
	public void update();
	
	public void delete(int id);
	
	public Employee select(int id);
	
	public List<Employee> selectAll();

}
