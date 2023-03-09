package com.springcore.stereo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
@Value("1")
	private int id;
@Value("Radhika")
	private String name;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name +  "]";
	}
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	
}
