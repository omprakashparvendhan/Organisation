package com.ash.programming.request;

import org.springframework.stereotype.Component;

@Component
public class EmployeeRequest {
	private Object request;

	public Object getRequest() {
		return request;
	}

	public void setRequest(Object request) {
		this.request = request;
	}

	@Override
	public String toString() {
		return "EmployeeRequest [request=" + request + "]";
	}
}
