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
@Table(name="employee")
public class Employee {

		private int did;
		private String dnmae;
		private double salary;
		private EmployeeInfo einfo;
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		
		public int getDid() {
			return did;
		}
		public void setDid(int did) {
			this.did = did;
		}
		public String getDnmae() {
			return dnmae;
		}
		public void setDnmae(String dnmae) {
			this.dnmae = dnmae;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		@OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
		public EmployeeInfo getEinfo() {
			return einfo;
		}
		public void setEinfo(EmployeeInfo einfo) {
			this.einfo = einfo;
		}
		
}
