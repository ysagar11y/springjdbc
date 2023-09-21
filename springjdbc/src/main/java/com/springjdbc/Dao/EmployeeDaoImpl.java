package com.springjdbc.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.springjdbc.Entity.Employee;

@Component
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private Employee employee;
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void insert() {

		String query = "insert into employee(id,name,salary,rating) value(?,?,?,?)";

		int result = jdbcTemplate.update(query, employee.getId(), employee.getName(), employee.getSalary(),
				employee.getRating());

		System.out.println(result + " Row inserted");

	}

	public void update() {

		String query = "update employee set id=? where name=? and rating=?";

		int res = jdbcTemplate.update(query, employee.getId(), employee.getName(), employee.getRating());

		System.out.println(res + " Row updated");

	}

	public Employee select(int id) {

		String query = "select * from Employee where id=?";

		RowMapper<Employee> rowMapper = new RowMapperImpl();
		
		Employee emp = this.jdbcTemplate.queryForObject(query, rowMapper,id);

		return emp;
	}

}
