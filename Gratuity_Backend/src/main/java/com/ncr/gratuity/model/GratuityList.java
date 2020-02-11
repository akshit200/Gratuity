package com.ncr.gratuity.model;

import javax.persistence.*;

@Entity
@Table(name = "GratuityFields")
public class GratuityList {   

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long ID;
    
    @Column(name= "Name")
    private String name;
    
    @Column(name= "FatherName")
    private String father_name;
    
    @Column(name= "Gender")
    private String gender;
    
    //private Long ID;
    @Column(name= "EmployeeNumber")
    private String emp_no;
    
    @Column(name= "Religion")
    private String religion;
    
    @Column(name= "marital_status")
    private String marital_status;
    
    @Column(name= "DOB")
    private String dob;
    
    @Column(name= "paddress")
    private String paddress;
    
    @Column(name= "ehusband")
    private String ehusband;
    
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

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	
//    @Column(name= "Religion")
//    private long religion;
//    
//    @Column(name= "Marital_Status")
//    private long marital_status;
 
    
	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}



}

//RS185540