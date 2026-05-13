package com.bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="employeeinfo")
public class EmployeeInfo {

	private int einfo;
	private String fname,lname,email,mobile;
	private Employee emp;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getEinfo() {
		return einfo;
	}
	public void setEinfo(int einfo) {
		this.einfo = einfo;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "einfo")
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	
}
