package com.tns.inheritance2;

import javax.persistence.DiscriminatorValue;

@Entity
@DiscriminatorValue("MGR")
public class Manager extends Employee
{
	private static final long serialVersionUID=1L;
	private String deptName;
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
}