package com.xp.java.springboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.xp.java.springboot.entities.Address;
import com.xp.java.springboot.entities.Employee;
import com.xp.java.springboot.repository.AddressRepository;
import com.xp.java.springboot.repository.EmployeeRepository;
import com.xp.java.springboot.services.EmployeeService;

@SpringBootApplication
public class SpringBootPocApplication implements CommandLineRunner{
	
//	@Autowired
//	EmployeeRepository empRepository;
//	
//	@Autowired
//	AddressRepository addRepository;
//	
	@Autowired
	EmployeeService empService;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPocApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		List<Address> addList=new ArrayList<>();
		Employee emp1=new Employee();
		emp1.setAge(10);
		emp1.setEmp_id(1);
		emp1.setEmp_name("Swapnil");
		emp1.setEmp_salary(10000);
		Address add1=new Address();
		add1.setAdd_Id(1);
		add1.setAddressType("Home");
		add1.setEmp(emp1);
		add1.setLane("l1");
		add1.setPincode(411058);
		add1.setState("Mh");
		addList.add(add1);
		emp1.setAddList(addList);
		//emp1.getAddList().add(add1);
		//emp1.setAddList(addList);
		
		empService.createOrUpdateEmployee(emp1);
		//empRepository.save(emp1);
		
	}
	

}
