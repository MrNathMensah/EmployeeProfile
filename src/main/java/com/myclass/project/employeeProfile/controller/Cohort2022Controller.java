package com.myclass.project.employeeProfile.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.myclass.project.employeeProfile.dao.Cohort2022Dao;
import com.myclass.project.employeeProfile.pojo.Cohorts2022;
import com.myclass.project.employeeProfile.service.Cohort2022ServiceImplement;

@RestController
public class Cohort2022Controller {
	
	//Using the Constructor method to get data from the database
	@Autowired
	private Cohort2022Dao dao;
	
	@Autowired
	private Cohort2022ServiceImplement service;
	
	@PostMapping("/addProjectCohort2022")
	public ResponseEntity<?> addNewProject(@RequestBody Cohorts2022 cohort2022){
		
		boolean serviceCohort = service.addProject(cohort2022);
		HttpHeaders header = new HttpHeaders();
		header.add("desc", "this is to add book");
		if(!serviceCohort) {
			dao.save(cohort2022);
			return ResponseEntity.ok("Project is saved successfully");
		}
		
		return new ResponseEntity<String>("Project with this Group Name already exist", HttpStatus.OK);
	}
	}
	
	//using the auto-wired method other than the constructor method
//	@Autowired
//	private EmployeeProfileDao dao;
//	
//	@Autowired
//	private EmployeeProfileServiceImplement service;
//	
//	@PostMapping("/auth")
//	public ResponseEntity<?> auth(@RequestBody EmployeeProfile employee){
//		
//		EmployeeProfile emp = service.authenticate(employee);
//		
//		if(emp != null) {
//		
//		return new ResponseEntity<EmployeeProfile>(emp, HttpStatus.OK);
//		}
//		
//		return new ResponseEntity<String>("Invalid user input", HttpStatus.OK);
//	}
//	
//	//Select all or Find all from the database
//	@GetMapping("/all")
//	public List<EmployeeProfile> getAllEmp(){
//		return dao.findAll();
//	}
//	
//	//Save Method// Validation Method
//	@PostMapping("/employeevalidation")
//	public ResponseEntity<?> newEmployee(@RequestBody EmployeeProfile emp) {
//		
//		EmployeeProfile employee = service.validateEmployee(emp);
//		if(employee != null) {
//			//dao.save(employee);
//			return new ResponseEntity<EmployeeProfile> (employee, HttpStatus.OK);
//		}
//			//dao.save(employee);
//			return new ResponseEntity<String> ("Email does not Exist", HttpStatus.OK);
//	}
//	
//	
//	//Delete Method
//	@DeleteMapping("/employee/{id}")
//	public void deleteEmployee(@PathVariable Long id) {
//		dao.deleteById(id);
//	}
//	
//	//Find Employee by id
//	@GetMapping("/find/{id}")
//	public EmployeeProfile getEmployee(@PathVariable Long id) {
//		Optional<EmployeeProfile> opt = dao.findById(id);
//		if(opt.isPresent()) {
//			return opt.get();
//		}
//		return null;
//	}
//	
//	@PutMapping("/update/{id}")
//	public EmployeeProfile updateEmployeeProfile(@RequestBody EmployeeProfile newEmployee, @PathVariable Long id){
//		return dao.findById(id)
//				.map(employee -> {
//				employee.setPassword(newEmployee.getPassword());
//				employee.setName(newEmployee.getName());
//				employee.setRole(newEmployee.getRole());
//				employee.setEmail(newEmployee.getEmail());
//				
//				return dao.save(employee);
//				})
//				.orElseGet(()->{
//					newEmployee.setId(id);
//					return dao.save(newEmployee);
//				});
//		
//		}
	


