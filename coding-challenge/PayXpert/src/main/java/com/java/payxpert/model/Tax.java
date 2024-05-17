package com.java.payxpert.model;

import java.util.Objects;

public class Tax {
	private int taxID;
	private int employeeId;
	private String taxYear;
	private double taxableIncome;
	private double taxAmount;
	public int getTaxID() {
		return taxID;
	}
	public void setTaxID(int taxID) {
		this.taxID = taxID;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getTaxYear() {
		return taxYear;
	}
	public void setTaxYear(String taxYear) {
		this.taxYear = taxYear;
	}
	public double getTaxableIncome() {
		return taxableIncome;
	}
	public void setTaxableIncome(double taxableIncome) {
		this.taxableIncome = taxableIncome;
	}
	public double getTaxAmount() {
		return taxAmount;
	}
	public void setTaxAmount(double taxAmount) {
		this.taxAmount = taxAmount;
	}
	@Override
	public String toString() {
		return "Tax [taxID=" + taxID + ", employeeId=" + employeeId + ", taxYear=" + taxYear + ", taxableIncome="
				+ taxableIncome + ", taxAmount=" + taxAmount + "]";
	}
	public Tax() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tax(int taxID, int employeeId, String taxYear, double taxableIncome, double taxAmount) {
		super();
		this.taxID = taxID;
		this.employeeId = employeeId;
		this.taxYear = taxYear;
		this.taxableIncome = taxableIncome;
		this.taxAmount = taxAmount;
	}
	@Override
	public int hashCode() {
		return Objects.hash(taxID, employeeId, taxYear,  taxableIncome ,taxAmount );
	}
	
	@Override
	public boolean equals(Object obj) {
		Tax t = (Tax)obj;
		if (t.getTaxID() == taxID && t.getEmployeeId() == employeeId
				&& t.getTaxYear()==taxYear && t.getTaxableIncome()==taxableIncome
				&& t.getTaxAmount()==taxAmount 
				) {
			return true;
		}
		return false;
	}
	
}
