package io.ryanchee.example.spring.springwebreactjsexample;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<EmployeeBean, Long> {
	
}