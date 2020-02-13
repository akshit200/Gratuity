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
    
    @Column(name= "n_name")
    private String n_name;
    
    @Column(name= "n_address")
    private String n_address;
    
    @Column(name= "n_relation")
    private String n_relation;
    
    @Column(name= "n_dob")
    private String n_dob;
    
    @Column(name= "n_amount")
    private String n_amount;
   
    @Column(name= "w1_sig")
    private String w1_sig;
    
    @Column(name= "w2_sig")
    private String w2_sig;
    
    @Column(name= "emp_sig")
    private String emp_sig;
    
  
    
    public String getW1_sig() {
		return w1_sig;
	}

	public void setW1_sig(String w1_sig) {
		this.w1_sig = w1_sig;
	}

	public String getW2_sig() {
		return w2_sig;
	}

	public void setW2_sig(String w2_sig) {
		this.w2_sig = w2_sig;
	}

	public String getEmp_sig() {
		return emp_sig;
	}

	public void setEmp_sig(String emp_sig) {
		this.emp_sig = emp_sig;
	}

	public String getN_name() {
		return n_name;
	}

	public void setN_name(String n_name) {
		this.n_name = n_name;
	}

	public String getN_address() {
		return n_address;
	}

	public void setN_address(String n_address) {
		this.n_address = n_address;
	}

	public String getN_relation() {
		return n_relation;
	}

	public void setN_relation(String n_relation) {
		this.n_relation = n_relation;
	}

	public String getN_age() {
		return n_dob;
	}

	public void setN_age(String n_dob) {
		this.n_dob = n_dob;
	}

	public String getN_amount() {
		return n_amount;
	}

	public void setN_amount(String n_amount) {
		this.n_amount = n_amount;
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