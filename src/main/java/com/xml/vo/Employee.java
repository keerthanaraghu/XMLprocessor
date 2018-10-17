package com.xml.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "employee")
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee {
	
	


	public Employee(String type, Department department, String firstName, String eid, String lastName) {
		super();
		this.type = type;
		this.department = department;
		this.firstName = firstName;
		this.eid = eid;
		this.lastName = lastName;
	}
	

	public Employee() {
	}



	@XmlAttribute(name = "type")
	private String type;
	
	@XmlElement(name = "department")
	private Department department;
	
	@XmlElement(name = "firstName")
	private String firstName;
	
	@XmlElement(name = "eid")
	private String eid;
	
	@XmlElement(name = "lastName")
	private String lastName;

	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getEid() {
		return eid;
	}


	public void setEid(String eid) {
		this.eid = eid;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	@Override
	public String toString() {
		return "Employee [type=" + type + ", department=" + department + ", firstName=" + firstName + ", eid=" + eid
				+ ", lastName=" + lastName + "]";
	}

}
