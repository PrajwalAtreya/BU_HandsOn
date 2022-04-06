package com.rays.model;

import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	@Size(min = 3, max = 10)
	private String empName;
	
	@Min(value = 18)
	@Max(value = 45)
	private int empAge;
	
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date empJoinDate;
	
	@Min(value = 12000)
	@Max(value = 45000)
	private double empSalary;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String empName, int empAge, Date empJoinDate, double empSalary) {
		super();
		this.empName = empName;
		this.empAge = empAge;
		this.empJoinDate = empJoinDate;
		this.empSalary = empSalary;
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public Date getEmpJoinDate() {
		return empJoinDate;
	}
	public void setEmpJoinDate(Date empJoinDate) {
		this.empJoinDate = empJoinDate;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empAge=" + empAge + ", empJoinDate="
				+ empJoinDate + ", empSalary=" + empSalary + "]";
	}

}
