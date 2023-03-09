package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
	
	private String empName;
	private List<String> phone;
	private Set<String> Address;
	private Map<String, String> courses;
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public List<String> getPhone() {
		return phone;
	}
	public void setPhone(List<String> phone) {
		this.phone = phone;
	}
	public Set<String> getAddress() {
		return Address;
	}
	public void setAddress(Set<String> address) {
		Address = address;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	
	@Override
	public String toString() {
		return "Emp [empName=" + empName + ", phone=" + phone + ", Address=" + Address + ", courses=" + courses + "]";
	}
	
	

}
