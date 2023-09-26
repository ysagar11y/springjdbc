package com.springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbc.Dao.EmployeeDaoImpl;
import com.springjdbc.Entity.Employee;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springjdbc/config.xml");

		EmployeeDaoImpl employeeDao = (EmployeeDaoImpl) con.getBean("employeeDaoImpl");

		List<Employee> emp = employeeDao.selectAll();
		for(Employee e :emp) {
			System.out.println(e);
		}
		
		employeeDao.delete(2);
		
		List<Employee> emp1 = employeeDao.selectAll();
		for(Employee e :emp1) {
			System.out.println(e);
		}

	}
}
