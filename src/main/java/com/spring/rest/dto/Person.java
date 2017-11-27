package com.spring.rest.dto;

public class Person {

	private int id;
	private String name;
	private String dept;
	private long age;

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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public long getAge() {
		return age;
	}

	public void setAge(long age) {
		this.age = age;
	}

	public Person(int id, String name, String dept, long age) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.age = age;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

}
