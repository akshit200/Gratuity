package com.ncr.gratuity.model;

import java.util.Date;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;



@Entity
@Table(name = "FormFields")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
public class FormModel {   


	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long form_id;
    
    @Column(name= "First_Name")
    private String first_name;
    
    @Column(name= "Last_Name")
    private String last_name;
    
    @Column(name= "DOB")
    private Date dob;
    
    @Column(name= "marital_status")
    private String marital_status;
    
    
    @Column(name= "paddress")
    private String paddress;
    
    @Column(name= "eps_no")
    private String eps_no;
    
    @JsonManagedReference
    @OneToMany(fetch = FetchType.EAGER,cascade=CascadeType.ALL,mappedBy="formModel")
   
    private Set<NomineeList> nomineeList;
    
 
	
    @Column(name= "Email")
    private String email;
    
    @Column(name= "FatherName")
    private String father_name;
    
    @Column(name= "Gender")
    private String gender;
    
    //private Long ID;
    @Column(name= "EmployeeNumber")
    private String emp_no;
    
    @Column(name= "Religion")
    private String religion;
    
    @Column(name= "ehusband")
    private String ehusband;

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

  
    public String getEmail() {
		return email;
	}
    public void setEmail(String email) {
		this.email=email;
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
	
	

	public Long getForm_id() {
		return form_id;
	}

	public void setID(Long form_id) {
		this.form_id = form_id;
	}
	
    public String getLast_name() {
		return last_name;
	}
    public void setLast_name(String last_name) {
		this.last_name=last_name;
	}
    
    
    public String getEps_no() {
		return eps_no;
	}

	public void setEps_no(String eps_no) {
		this.eps_no = eps_no;
	}
    

	 public String getFirst_name() {
			return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name=first_name;
	}
	    
/*
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

	public Date getN_age() {
		return n_dob;
	}

	public void setN_age(Date n_dob) {
		this.n_dob = n_dob;
	}

	public String getN_amount() {
		return n_amount;
	}

	public void setN_amount(String n_amount) {
		this.n_amount = n_amount;
	}
*/
	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
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

//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}

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

	   
    public Set<NomineeList> getNomineeList() {
		return nomineeList;
	}

	public void setNomineeList(Set<NomineeList> nomineeList) {
		this.nomineeList = nomineeList;
	}
	    



}

//@Column(name= "Religion")
//private long religion;
//
//@Column(name= "Marital_Status")
//private long marital_status;


//RS185540