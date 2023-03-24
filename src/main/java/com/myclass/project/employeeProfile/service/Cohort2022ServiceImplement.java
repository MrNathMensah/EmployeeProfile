package com.myclass.project.employeeProfile.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.myclass.project.employeeProfile.dao.Cohort2022Dao;
import com.myclass.project.employeeProfile.pojo.Cohorts2022;

@Service
public class Cohort2022ServiceImplement implements Cohort2022ServiceInterface {

	@Autowired
	private Cohort2022Dao dao;

	@Override
	public boolean addProject(Cohorts2022 cohort2022) {
		Cohorts2022 add = new Cohorts2022();
		add.setCohortName(cohort2022.getCohortName());
		
		Example<Cohorts2022> cohortExamp = Example.of(add);
		Optional<Cohorts2022> option = dao.findOne(cohortExamp);
		if(option.isPresent()) {
			return true;
		}
		return false;
	}
	
//	@Autowired
//	private EmployeeProfileDao dao;
//	
//	@Override
//	public EmployeeProfile authenticate(EmployeeProfile employee) {
//		EmployeeProfile emp = new EmployeeProfile();
//		emp.setEmail(employee.getEmail());
//		emp.setPassword(employee.getPassword());
//		//use example interface to findone from all the options
//		Example<EmployeeProfile> empExamp = Example.of(emp);
//		Optional<EmployeeProfile> option = dao.findOne(empExamp);
//		
//		if(option.isPresent()) {
//			return option.get();
//		}
//		return null;
//	}
//
//	@Override
//	public EmployeeProfile findById(EmployeeProfile employee) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public EmployeeProfile validateEmployee(EmployeeProfile employee) {
//		
//		EmployeeProfile emp = new EmployeeProfile();
//		emp.setEmail(employee.getEmail());
//		
//		Example<EmployeeProfile> empExam = Example.of(emp);
//		
//		Optional<EmployeeProfile> optional = dao.findOne(empExam);
//		
//		if(optional.isPresent()) {
//			
//			return optional.get();
//		}
//			return null;
//	
//	}

//	@Override
//	public EmployeeProfile validateEmployee(Long id) {
//		 Optional<EmployeeProfile> optional = dao.findById(id);
//		 if(optional.isPresent()) {
//			 return optional.get();
//	}
//		return null;
//	}
}
