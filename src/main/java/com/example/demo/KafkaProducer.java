package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.example.Employee;

@Component
public class KafkaProducer {

	@Autowired
	KafkaTemplate<String, Employee> kafkaTemplate;
	
	public void send(Employee employee) {
		kafkaTemplate.send("employee-topic1",employee);
	}
	
}
