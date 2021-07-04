package com.ash.programming.controller;



import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ash.programming.response.OrganisationResponse;
import com.ash.programming.service.OrganisationServiceImpl;

@RestController
@RequestMapping("/ashprogramming")
public class OrganisationController {
	
	@Autowired
	private OrganisationServiceImpl orgService;
	
	@Autowired
	private OrganisationResponse orgResponse;
	
	@GetMapping(path="/getEmployees", produces=MediaType.APPLICATION_JSON_VALUE)
	public Object getEmployees() {
		orgResponse = orgService.getEmployees();
		return orgResponse.getStatus();
		
	}
	
	@GetMapping(path="/getStructure", produces=MediaType.APPLICATION_JSON_VALUE)
	public Object getStructure() {
		orgResponse = orgService.getStructure();
		return orgResponse.getStatus();
	}
	
	@GetMapping(path="/getEmployee/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	public Object getEmployee(@PathVariable(value = "id") Integer empID) {
		orgResponse = orgService.getEmployee(empID);
		return orgResponse;		
	}
	
	@GetMapping(path="/getOrganisationStructure", produces=MediaType.APPLICATION_JSON_VALUE)
	public Object getOrganisationStructure() {
		try {
			orgResponse = orgService.getOrganisationStructure();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return orgResponse.getStatus();
	}
}
