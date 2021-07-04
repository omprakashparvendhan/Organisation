package com.ash.programming.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.ash.programming.dao.vo.Employee;
import com.ash.programming.dao.vo.Structure;

@Mapper
public interface OrganisationMapper {
	
	@Results({
		@Result(column="EMP_ID", property="employeeID"),
		@Result(column="EMP_NAME", property="employeeName"),
		@Result(column="EMP_DEPARTMENT", property="employeeDepartment"),
		@Result(column="EMP_ROLE", property="role"),
		@Result(column="DOJ", property="dateOfJoining"),
		@Result(column="EMAIL_ID", property="emailId"),
		@Result(column="PERSONAL_EMAIL", property="personalEmail"),
		@Result(column="ADDRESS_LN1", property="address.addressLn1"),
		@Result(column="ADDRESS_LN2", property="address.addressLn2"),
		@Result(column="ADDRESS_LN3", property="address.addressLn3"),
		@Result(column="CITY", property="address.city"),
		@Result(column="STATE", property="address.state"),
		@Result(column="COUNTRY", property="address.country"),
		@Result(column="PINCODE", property="address.pincode"),
		@Result(column="PASSPORT_NO", property="passportNumber"),
		@Result(column="PRIMARY_SKILL", property="primarySkill")
	})
	@Select("select * from EMP_PROFILE")
	public List<Employee> getEmployees();
	
	
	@Results({
		@Result(column="DEPARTMENT", property="department"),
		@Result(column="SUPERVISOR", property="supervisor"),
		@Result(column="EMP_ID", property="empID")
	})
	@Select("SELECT * FROM ORGANISATION_STRUCTURE")
	public List<Structure> getStructure();

	@Results({
		@Result(column="EMP_ID", property="employeeID"),
		@Result(column="EMP_NAME", property="employeeName"),
		@Result(column="EMP_DEPARTMENT", property="employeeDepartment"),
		@Result(column="EMP_ROLE", property="role"),
		@Result(column="DOJ", property="dateOfJoining"),
		@Result(column="EMAIL_ID", property="emailId"),
		@Result(column="PERSONAL_EMAIL", property="personalEmail"),
		@Result(column="ADDRESS_LN1", property="address.addressLn1"),
		@Result(column="ADDRESS_LN2", property="address.addressLn2"),
		@Result(column="ADDRESS_LN3", property="address.addressLn3"),
		@Result(column="CITY", property="address.city"),
		@Result(column="STATE", property="address.state"),
		@Result(column="COUNTRY", property="address.country"),
		@Result(column="PINCODE", property="address.pincode"),
		@Result(column="PASSPORT_NO", property="passportNumber"),
		@Result(column="PRIMARY_SKILL", property="primarySkill")
	})
	@Select("SELECT * FROM EMP_PROFILE WHERE EMP_ID = #{empID}")
	public Employee getEmployee(Integer empID);
	
	
}
