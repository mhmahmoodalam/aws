package com.example.dto;

import java.util.Map;

public class RequestParams {

	private String method;
	private customerDTO body;
	private Map<String,Object> queryParams;
	private Map<String,Object> headerParams;
	private Map<String,Object> pathParams;
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public customerDTO getBody() {
		return body;
	}
	public void setBody(customerDTO body) {
		this.body = body;
	}
	public Map<String, Object> getQueryParams() {
		return queryParams;
	}
	public void setQueryParams(Map<String, Object> queryParams) {
		this.queryParams = queryParams;
	}
	public Map<String, Object> getHeaderParams() {
		return headerParams;
	}
	public void setHeaderParams(Map<String, Object> headerParams) {
		this.headerParams = headerParams;
	}
	public Map<String, Object> getPathParams() {
		return pathParams;
	}
	public void setPathParams(Map<String, Object> pathParams) {
		this.pathParams = pathParams;
	}
	
	
}
