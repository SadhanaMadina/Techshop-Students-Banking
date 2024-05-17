package com.java.payxpert.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.java.payxpert.dao.EmployeeService;
import com.java.payxpert.model.Employee;

public class CalculateAge {
	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Enter dob");
		String d=sc.next();
		Date dob=sdf.parse(d);
		EmployeeService e=new EmployeeService();
		int a= e.CalculateAge(dob);
		System.out.println("Age ="+a);
	}

}
