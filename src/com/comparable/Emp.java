package com.comparable;

public class Emp implements Comparable<Emp> {

	private int empId;
	private String name;
	private int phone;
	
	// Comparable sort the data on the basis of single logic
	@Override
	public int compareTo(Emp o) {

		return this.empId-o.empId;
	}
	
	
	public int getEmpId() {
		return empId;
	}
	
	public Emp(int empId, String name, int phone) {
		super();
		this.empId = empId;
		this.name = name;
		this.phone = phone;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", name=" + name + ", phone=" + phone + "]";
	}

	

	
}
