package com.springjdbc;

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

		Employee emp = employeeDao.select(2);
		System.out.println(emp);

	}
}
