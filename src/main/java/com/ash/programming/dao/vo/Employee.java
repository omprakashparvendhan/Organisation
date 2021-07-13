package com.ash.programming.dao.vo;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	private String employeeID;
	private String employeeName;
	private String employeeDepartment;
	private String role;
	private Date dateOfJoining;
	private String emailId;
	private String personalEmail;
	private Address address;
	private String passportNumber;
	private String primarySkill;
	private Integer pastExperience;
	private Integer compExperience;
	private Integer salary;
	public Integer getPastExperience() {
		return pastExperience;
	}
	public void setPastExperience(Integer pastExperience) {
		this.pastExperience = pastExperience;
	}
	public Integer getCompExperience() {
		return compExperience;
	}
	public void setCompExperience(Integer compExperience) {
		this.compExperience = compExperience;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public String getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeDepartment() {
		return employeeDepartment;
	}
	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPersonalEmail() {
		return personalEmail;
	}
	public void setPersonalEmail(String personalEmail) {
		this.personalEmail = personalEmail;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getPassportNumber() {
		return passportNumber;
	}
	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}
	public String getPrimarySkill() {
		return primarySkill;
	}
	public void setPrimarySkill(String primarySkill) {
		this.primarySkill = primarySkill;
	}
	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", employeeName=" + employeeName
				+ ", employeeDepartment=" + employeeDepartment + ", role=" + role + ", dateOfJoining=" + dateOfJoining
				+ ", emailId=" + emailId + ", personalEmail=" + personalEmail + ", address=" + address
				+ ", passportNumber=" + passportNumber + ", primarySkill=" + primarySkill + ", pastExperience="
				+ pastExperience + ", compExperience=" + compExperience + ", salary=" + salary + "]";
	}
	
}
