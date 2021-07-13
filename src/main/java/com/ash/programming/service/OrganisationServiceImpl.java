package com.ash.programming.service;

import java.util.Date;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ash.programming.dao.mapper.OrganisationMapper;
import com.ash.programming.dao.vo.Employee;
import com.ash.programming.dao.vo.Structure;
import com.ash.programming.response.OrganisationResponse;
@Service
public class OrganisationServiceImpl implements OrganisationService {

	@Autowired
	private OrganisationResponse orgResponse;
	@Autowired
	private Employee employee;
	private OrganisationMapper orgMapper;

	public OrganisationServiceImpl(OrganisationMapper orgMapper) {
		this.orgMapper = orgMapper; 
	}
	
	public OrganisationResponse getEmployees() {
		List<Employee> employees = orgMapper.getEmployees();
		if(null!=employees) {
			orgResponse.setStatus(employees);
			return orgResponse;
		}
		else {
			orgResponse.setStatus("No employees found!");
			return orgResponse;
		}
	}
	
	
	public OrganisationResponse getStructure() {
		List<Structure> structure = orgMapper.getStructure();
		if(null!=structure) {
			orgResponse.setStatus(structure);
			return orgResponse;
		}
		else {
			orgResponse.setStatus("No structure is formed yet.");
			return orgResponse;
		}
	}
	
	
	public OrganisationResponse getEmployee(Integer empID) {
		employee = orgMapper.getEmployee(empID);
		if(null!=employee) {
			orgResponse.setStatus(employee);
			return orgResponse;
		}
		else {
			orgResponse.setStatus("Inavlid Request! Provide a proper ID");
			return orgResponse;
		}
	}

	public OrganisationResponse getOrganisationStructure() throws JSONException {
		// TODO Auto-generated method stub
		JSONObject json = new JSONObject();
		List<Employee> employeeList = orgMapper.getEmployees();
		List<Structure> structure = orgMapper.getStructure();
		if(employeeList!=null && structure!=null) {
			for(Structure struct : structure) {
				JSONArray array = new JSONArray();
				for(Employee emp : employeeList) {
					
					JSONObject data = new JSONObject();
					if(!emp.getEmployeeDepartment().equalsIgnoreCase(struct.getDepartment())) {
						continue;
					}
					data.put("empID", emp.getEmployeeID());
					data.put("empName", emp.getEmployeeName());
					data.put("Role", emp.getRole());
					array.put(data);
					
				}
				if(array!=null || array.length()!=0) {
					json.put(struct.getDepartment(),array);
				}
			}
			orgResponse.setStatus(json.toString());
			return orgResponse;
		}
		orgResponse.setStatus("Error in getting the required data from DB");
		return orgResponse;
	}

	public Object addEmployee(Employee employee) {
		if(employee.getEmployeeID()!=null) {
			employee.setDateOfJoining(new Date());
			try {
				orgMapper.createEmployee(employee);
				orgResponse.setStatus("Success! Employee Added to Organisation.");
			}
			catch(Exception e) {
				orgResponse.setStatus("Error : " + e);
			}
		}
		else {
			orgResponse.setStatus("Error : Employee ID is missing");
		}
		return orgResponse;
	}
}
