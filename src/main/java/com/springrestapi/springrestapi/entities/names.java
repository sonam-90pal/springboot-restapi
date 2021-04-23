package com.springrestapi.springrestapi.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class names {

	@Id
	 private long empid;
	 private String name;
	 private String job;
	public names(long empid, String name, String job) {
		super();
		this.empid = empid;
		this.name = name;
		this.job = job;
	}
	
	public names() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getEmpid() {
		return empid;
	}

	public void setEmpid(long empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	@Override
	public String toString() {
		return "names [empid=" + empid + ", name=" + name + ", job=" + job + "]";
	}

	public void setJob(String job) {
		this.job = job;
	}
	 
}
