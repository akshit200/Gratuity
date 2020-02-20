package com.ncr.gratuity.ValueObjects;

import java.util.Date;
//import java.io.Serializable;
import java.util.Set;

import com.ncr.gratuity.model.NomineeList;

public class EpsVo {
	
    private Long id;
	private String first_name;
    private Long employeeId;
    private String fatherName;
    private Date dateOfJoining;
	private String last_name;
    private Date dob;
    private String marital_status;
    private String paddress;
    private String eps_no;
    private byte[] subscriberSign;
    private byte[] employerSign;
    
    private Set<NomineeList> nomineeList;
    
    public Set<NomineeList> getNomineeList() {
		return nomineeList;
	}

	public void setNomineeList(Set<NomineeList> nomineeList) {
		this.nomineeList = nomineeList;
	}
	    
    
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}


	
	public String getMarital_status() {
		return marital_status;
	}
	public void setMarital_status(String marital_status) {
		this.marital_status = marital_status;
	}
	public String getPaddress() {
		return paddress;
	}
	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}
	public String getEps_no() {
		return eps_no;
	}
	public void setEps_no(String eps_no) {
		this.eps_no = eps_no;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public byte[] getSubscriberSign() {
		return subscriberSign;
	}

	public void setSubscriberSign(byte[] subscriberSign) {
		this.subscriberSign = subscriberSign;
	}

	public byte[] getEmployerSign() {
		return employerSign;
	}

	public void setEmployerSign(byte[] employerSign) {
		this.employerSign = employerSign;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
    
}
