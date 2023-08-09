package com.tap.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employe {
	
	@Id
	private int empId;
	private String empName;
	private String empAddress;
	
	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employe(int empId, String empName, String empAddress) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	@Override
	public String toString() {
		return "MyEntity [empId=" + empId + ", empName=" + empName + ", empAddress=" + empAddress + "]";
	}
	
	
}
