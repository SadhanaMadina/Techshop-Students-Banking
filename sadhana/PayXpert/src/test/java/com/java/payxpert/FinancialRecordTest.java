package com.java.payxpert;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;

import com.java.payxpert.model.Employee;
import com.java.payxpert.model.FinancialRecord;
import com.java.payxpert.model.Tax;

public class FinancialRecordTest {


	@Test
	public void testConstructors() throws ParseException {
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		FinancialRecord f= new FinancialRecord();
		assertNotNull(f);
		FinancialRecord f1 = new FinancialRecord(1, 1, sdf.parse("01/04/2024"), "Salary", 50000, "Income");
	}
	
	@Test
	public void testGettersSetters() throws ParseException {
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		FinancialRecord f= new FinancialRecord();
		f.setRecordId(1);
		f.setEmployeeId(1);
		f.setRecordDate(sdf.parse("01/04/2024"));
		f.setDescription("Salary");
		f.setAmount(50000);
		f.setRecordType("Income");
		assertEquals(1,f.getRecordId());
		assertEquals(1,f.getEmployeeId());
		assertEquals(sdf.parse("01/04/2024"),f.getRecordDate());
		assertEquals("Salary",f.getDescription());
		assertEquals(50000,f.getAmount(),0);
		assertEquals("Income",f.getRecordType());
	}
	
	@Test
	public void testHashCode() throws ParseException {
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		FinancialRecord f1 = new FinancialRecord(1, 1, sdf.parse("01/04/2024"), "Salary", 50000, "Income");
		FinancialRecord f2 = new FinancialRecord(1, 1, sdf.parse("01/04/2024"), "Salary", 50000, "Income");
		assertEquals(f1.hashCode(), f2.hashCode());
	}

	@Test
	public void testEquals() throws ParseException {
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		FinancialRecord f1 = new FinancialRecord(1, 1, sdf.parse("01/04/2024"), "Salary", 50000, "Income");
		FinancialRecord f2 = new FinancialRecord(1, 1, sdf.parse("01/04/2024"), "Salary", 50000, "Income");
		FinancialRecord f3 = new FinancialRecord(1, 2, sdf.parse("01/04/2024"), "Salary", 50000, "Income");
		assertTrue(f1.equals(f2));
		assertFalse(f1.equals(f3));
	}
	

	
	@Test
	public void testToString() throws ParseException {
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		FinancialRecord f1 = new FinancialRecord(1, 1, sdf.parse("01/04/2024"), "Salary", 50000, "Income");
		String result = "FinancialRecord [RecordId=1, EmployeeId=1, RecoedDate=Mon Apr 01 00:00:00 IST 2024, Description=Salary, Amount=50000.0, RecordType=Income]";
		assertEquals(f1.toString(), result);
	}
	

}
