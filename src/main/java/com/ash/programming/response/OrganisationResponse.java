package com.ash.programming.response;

import org.springframework.stereotype.Component;

@Component
public class OrganisationResponse {
	private Object status;

	@Override
	public String toString() {
		return "OrganisationResponse [status=" + status + ", getStatus()=" + getStatus() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public Object getStatus() {
		return status;
	}

	public void setStatus(Object status) {
		this.status = status;
	}
}
