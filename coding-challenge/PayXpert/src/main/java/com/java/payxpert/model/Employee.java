package com.java.payxpert.model;

import java.util.Date;

import java.util.Objects;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId; 

public class Employee {
	private int employeeID;
	private String firstName;
	private String lastName;
	private String gender;
	private String email;
	private String phoneNumber;
	private String address ;
	private String position;
	private Date dateOfBirth;
	private Date joiningDate;
	private Date terminationDate;
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	public Date getTerminationDate() {
		return terminationDate;
	}
	public void setTerminationDate(Date terminationDate) {
		this.terminationDate = terminationDate;
	}
	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", gender=" + gender + ", email=" + email + ", phoneNumber=" + phoneNumber + ", address=" + address
				+ ", position=" + position + ", dateOfBirth=" + dateOfBirth + ", joiningDate=" + joiningDate
				+ ", terminationDate=" + terminationDate + "]";
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int employeeID, String firstName, String lastName, String gender, String email, String phoneNumber,
			String address, String position, Date dateOfBirth, Date joiningDate, Date terminationDate) {
		super();
		this.employeeID = employeeID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.position = position;
		this.dateOfBirth = dateOfBirth;
		this.joiningDate = joiningDate;
		this.terminationDate = terminationDate;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(employeeID, firstName,lastName, gender, email,
				phoneNumber, address,position,dateOfBirth,joiningDate,terminationDate);
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee employee = (Employee)obj;
		if (employee.getEmployeeID() == employeeID && employee.getFirstName() == firstName 
				&& employee.getLastName() == lastName && employee.getGender() == gender 
				&& employee.getEmail() == email && employee.getPhoneNumber() == phoneNumber 
				&& employee.getAddress() == address 
			&& employee.getPosition() == position 
			&& employee.getJoiningDate().compareTo(joiningDate)==0 
			&& employee.getDateOfBirth().compareTo(dateOfBirth)==0
			&& employee.getTerminationDate().compareTo(terminationDate)==0

				) {
			return true;
		}
		return false;
	}

}
