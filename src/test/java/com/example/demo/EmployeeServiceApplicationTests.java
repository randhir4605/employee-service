package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.Employee;

@SpringBootTest
class EmployeeServiceApplicationTests {

	@Autowired
	KafkaProducer kafkaProducer;
	
	@Test
	void contextLoads() {
		Employee employee=new Employee();
		employee.setFname("Randhir");
		employee.setLname("Raj");
		employee.setAge(33);
		kafkaProducer.send(employee);
	}

}
