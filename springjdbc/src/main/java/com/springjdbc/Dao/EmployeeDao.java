package com.springjdbc.Dao;

import com.springjdbc.Entity.Employee;

public interface EmployeeDao {
	
	public void insert();
	
	public void update();
	
	public Employee select(int id);

}
