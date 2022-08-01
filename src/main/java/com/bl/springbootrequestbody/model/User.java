package com.bl.springbootrequestbody.model;

public class User {
	
	private String name;
	private String location;
	private long  age;
	public String getName() {
		return name;
	}
	public String getLocation() {
		return location;
	}
	public long getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setAge(long age) {
		this.age = age;
	}

	
}
