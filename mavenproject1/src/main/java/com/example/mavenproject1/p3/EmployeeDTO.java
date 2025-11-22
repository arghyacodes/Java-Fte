package com.example.mavenproject1.p3;

public class EmployeeDTO {
	private int empid;
	private String empname;
	public EmployeeDTO(int empid, String empname) {
		super();
		this.empid = empid;
		this.empname = empname;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
	

}
