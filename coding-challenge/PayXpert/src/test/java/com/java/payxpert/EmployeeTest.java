package com.java.payxpert;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;

import com.java.payxpert.model.Employee;

public class EmployeeTest {

	@Test
	public void testDefaultConstructor() {
		Employee emp=new Employee();
		assertNotNull(emp);
		
	}
	
	@Test
	public void testParametrisedConstructor() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Employee emp = new Employee(1, "Sadhana", "Madina","Female", "sadhana@gmail.com", 
				"9933993399", "Tekkali", "SWE", sdf.parse("10/10/2000"), sdf.parse("01/05/2024"), 
				sdf.parse("10/10/2055"));
	}

	@Test
	public void testGettersSetters() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Employee employee=new Employee();
		employee.setEmployeeID(1);
		employee.setFirstName("Sadhana");
		employee.setLastName("Madina");
		employee.setGender("Female");
		employee.setEmail("sadhana@gmail.com");
		employee.setPhoneNumber("9933993399");
		employee.setAddress("Tekkali");
		employee.setPosition("SWE");
		employee.setDateOfBirth(sdf.parse("10/10/2000"));
		employee.setJoiningDate(sdf.parse("01/05/2024"));
		employee.setTerminationDate(sdf.parse("10/10/2055"));
		
		assertEquals(1, employee.getEmployeeID());
		assertEquals("Sadhana", employee.getFirstName());
		assertEquals("Madina", employee.getLastName());
		assertEquals("Female", employee.getGender());
		assertEquals("sadhana@gmail.com", employee.getEmail());
		assertEquals("9933993399", employee.getPhoneNumber());
		assertEquals("Tekkali", employee.getAddress());
		assertEquals("SWE", employee.getPosition());
		assertEquals(sdf.parse("10/10/2000"), employee.getDateOfBirth());
		assertEquals(sdf.parse("01/05/2024"), employee.getJoiningDate());
		assertEquals(sdf.parse("10/10/2055"), employee.getTerminationDate());
		
	}
	
	
	
	@Test
	public void testHashCode() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Employee emp1 = new Employee(1, "Sadhana", "Madina","Female", "sadhana@gmail.com", 
				"9933993399", "Tekkali", "SWE", sdf.parse("10/10/2000"), sdf.parse("01/05/2024"),
				sdf.parse("10/10/2055"));
		Employee emp2 = new Employee(1, "Sadhana", "Madina","Female", "sadhana@gmail.com", 
				"9933993399", "Tekkali", "SWE", sdf.parse("10/10/2000"), sdf.parse("01/05/2024"), 
				sdf.parse("10/10/2055"));
		assertEquals(emp1.hashCode(), emp2.hashCode());
	}

	@Test
	public void testEquals() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Employee emp1 = new Employee(1, "Sadhana", "Madina","Female", "sadhana@gmail.com", 
				"9933993399", "Tekkali", "SWE", sdf.parse("10/10/2000"),sdf.parse("01/05/2024"), 
				sdf.parse("10/10/2055"));
		Employee emp2 = new Employee(1, "Sadhana", "Madina","Female", "sadhana@gmail.com", 
				"9933993399", "Tekkali", "SWE", sdf.parse("10/10/2000"), sdf.parse("01/05/2024"), 
				sdf.parse("10/10/2055"));
		Employee emp3 = new Employee(1, "Sadhana", "Madina","Female", "sadhana@gmail.com", 
				"99333399", "Tekkali", "SWE", sdf.parse("10/10/2000"), sdf.parse("01/05/2024"), 
				sdf.parse("10/10/2055"));
		assertTrue(emp1.equals(emp2));
		assertFalse(emp1.equals(emp3));
	}
	

	
	@Test
	public void testToString() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Employee emp1 = new Employee(1, "Sadhana", "Madina","Female", "sadhana@gmail.com", 
				"9933993399", "Tekkali", "SWE",sdf.parse("10/10/2000") , sdf.parse("01/05/2024"), 
				sdf.parse("10/10/2055"));
		String result = "Employee [employeeID=1, firstName=Sadhana, lastName=Madina, gender=Female, "
				+ "email=sadhana@gmail.com, phoneNumber=9933993399, address=Tekkali, position=SWE, "
				+ "dateOfBirth=Tue Oct 10 00:00:00 IST 2000, joiningDate=Wed May 01 00:00:00 IST 2024, "
				+ "terminationDate=Sun Oct 10 00:00:00 IST 2055]";
		assertEquals(emp1.toString(), result);
	}
	

}
