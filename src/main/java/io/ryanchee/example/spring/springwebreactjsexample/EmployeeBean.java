package io.ryanchee.example.spring.springwebreactjsexample;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class EmployeeBean {
	
	private @Id @GeneratedValue Long id;
	private String name;
	private int age;
	private int years;
	
	public EmployeeBean() {}
	
	public EmployeeBean(String name, int age, int years) {
	    this.name = name;
	    this.age = age;
	    this.years = years;
	}
}
