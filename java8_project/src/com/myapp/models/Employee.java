package com.myapp.models;

import java.util.Objects;

public class Employee {

	private int empId;
	private String empName;
	private int deptId;
	private String status = "active";
	private int salary;

	public Employee(int empId, String empName, int deptId, String status, int salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.deptId = deptId;
		this.status = status;
		this.salary = salary;
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

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(deptId, empId, empName, salary, status);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return deptId == other.deptId && empId == other.empId && Objects.equals(empName, other.empName)
				&& salary == other.salary && Objects.equals(status, other.status);
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", deptId=" + deptId + ", status=" + status
				+ ", salary=" + salary + "]";
	}

}
