package com.ncr.gratuity.ValueObjects;

import java.util.Date;
import java.util.Set;

import com.ncr.gratuity.model.GratuityNominee;

public class GratuityVo {
	
	private String first_name;
	private String father_name;
	private String gender;
	private String emp_no;
	private String religion;
	private String marital_status;
	private Date dob;
	private String paddress;
	private String ehusband;
	
	private Set<GratuityNominee> gratuityNominee;
	
	public Set<GratuityNominee> getGratuityNominee() {
		return gratuityNominee;
	}
	public void setGratuityNominee(Set<GratuityNominee> gratuityNominee) {
		this.gratuityNominee = gratuityNominee;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getFather_name() {
		return father_name;
	}
	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmp_no() {
		return emp_no;
	}
	public void setEmp_no(String emp_no) {
		this.emp_no = emp_no;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public String getMarital_status() {
		return marital_status;
	}
	public void setMarital_status(String marital_status) {
		this.marital_status = marital_status;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getPaddress() {
		return paddress;
	}
	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}
	public String getEhusband() {
		return ehusband;
	}
	public void setEhusband(String ehusband) {
		this.ehusband = ehusband;
	}
	
	

}
