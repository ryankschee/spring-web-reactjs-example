package io.ryanchee.example.spring.springwebreactjsexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {
 
    private final EmployeeRepository repository;
 
    @Autowired
    public DatabaseLoader(EmployeeRepository repository) {
        this.repository = repository;
    }
 
    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new EmployeeBean("Joe Biden", 45, 5));
        this.repository.save(new EmployeeBean("President Obama", 54, 8));
        this.repository.save(new EmployeeBean("Crystal Mac", 34, 12));
        this.repository.save(new EmployeeBean("James Henry", 33, 2));
    }
}
