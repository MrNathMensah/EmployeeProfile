package com.myclass.project.employeeProfile.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myclass.project.employeeProfile.pojo.Cohorts2022;

@Repository
public interface Cohort2022Dao extends JpaRepository<Cohorts2022, Long> {

}
