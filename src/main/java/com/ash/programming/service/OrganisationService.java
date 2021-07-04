package com.ash.programming.service;

import org.springframework.stereotype.Component;

import com.ash.programming.response.OrganisationResponse;

@Component
public interface OrganisationService {
	public OrganisationResponse getEmployees();
	public OrganisationResponse getStructure();
	public OrganisationResponse getEmployee(Integer empID);
}
