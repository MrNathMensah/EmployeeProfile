package com.myclass.project.employeeProfile.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Cohorts2022 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String cohortName;
	
	private String gitHubUrl;
	
	@Column(nullable = false)
	private String description;
	
	@Lob
	private byte[] files;
	
//	@Id
//	@GeneratedValue
//	private Long id;
//	private String name;
//	private String role;
//	private String email;
//	private String password;
//	public EmployeeProfile() {
//		super();
//	}
//	public EmployeeProfile(Long id, String name, String role, String email, String password) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.role = role;
//		this.email = email;
//		this.password = password;
//	}
//	public Long getId() {
//		return id;
//	}
//	public void setId(Long id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getRole() {
//		return role;
//	}
//	public void setRole(String role) {
//		this.role = role;
//	}
//	public String getEmail() {
//		return email;
//	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
	
}
