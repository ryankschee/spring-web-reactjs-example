package io.ryanchee.example.spring.springwebreactjsexample;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.BasePathAwareController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@BasePathAwareController
public class EmployeeController {

	private final static Logger logger = Logger.getLogger(EmployeeController.class);
	
	@Autowired
    private EmployeeRepository repository;
 	    
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
    	return "OK";
    }    

    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public List<EmployeeBean> getEmployees() {
    	logger.info("Calling GET /employees");
    	
    	return (List<EmployeeBean>) repository.findAll();
    }
}
