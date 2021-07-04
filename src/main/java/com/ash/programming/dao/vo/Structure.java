package com.ash.programming.dao.vo;

import org.springframework.stereotype.Component;

@Component
public class Structure {
	private String department;
	private String supervisor;
	private String empID;
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getSupervisor() {
		return supervisor;
	}
	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;
	}
	public String getEmpID() {
		return empID;
	}
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	@Override
	public String toString() {
		return "Structure [department=" + department + ", supervisor=" + supervisor + ", empID=" + empID + "]";
	}

}
