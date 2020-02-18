package com.ncr.gratuity.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import java.util.Set;



@Entity
@Table(name = "FormFields")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
public class FormModel {   


	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long form_id;
    
    
    				/******************************			
    				 *		EPS Nomination Form
    				 ******************************/
    
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
    
    
    @OneToMany(mappedBy="formModel")
    @JsonIgnore
    private Set<NomineeList> nomineeList;
    
    
    public Set<NomineeList> getNomineeList() {
		return nomineeList;
	}

	public void setNomineeList(Set<NomineeList> nomineeList) {
		this.nomineeList = nomineeList;
	}
	    
	/******************************			
	 *		Gratuity Form
	 ******************************/ 
	
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
    
    /******************************			
	 *		Form 11
	 ******************************/ 
    
    @Column(name= "Email_Id")
    private String Email_Id;
  
    @Column(name= "Mobile_no")
    private String Mobile_no;
    
    @Column(name= "Scheme_1952")
    private Boolean Scheme_1952;
    
    @Column(name= "Scheme_1955")
    private Boolean Scheme_1955;
    
    @Column(name= "International_worker")
    private Boolean International_worker;
    
    @Column(name= "IFS_Code")
    private String IFS_Code;

    @Column(name= "Aadhar_no")
    private String Aadhar_no;
    
    @Column(name= "PAN_no")
    private String PAN_no;
    
    public String getEmail_Id() {
		return Email_Id;
	}

	public void setEmail_Id(String email_Id) {
		Email_Id = email_Id;
	}

	public String getMobile_no() {
		return Mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		Mobile_no = mobile_no;
	}

	public Boolean getScheme_1952() {
		return Scheme_1952;
	}

	public void setScheme_1952(Boolean scheme_1952) {
		Scheme_1952 = scheme_1952;
	}

	public Boolean getScheme_1955() {
		return Scheme_1955;
	}

	public void setScheme_1955(Boolean scheme_1955) {
		Scheme_1955 = scheme_1955;
	}

	public Boolean getInternational_worker() {
		return International_worker;
	}

	public void setInternational_worker(Boolean international_worker) {
		International_worker = international_worker;
	}

	public String getIFS_Code() {
		return IFS_Code;
	}

	public void setIFS_Code(String iFS_Code) {
		IFS_Code = iFS_Code;
	}

	public String getAadhar_no() {
		return Aadhar_no;
	}

	public void setAadhar_no(String aadhar_no) {
		Aadhar_no = aadhar_no;
	}

	public String getPAN_no() {
		return PAN_no;
	}

	public void setPAN_no(String pAN_no) {
		PAN_no = pAN_no;
	}

	public String getW1_sig() {
		return w1_sig;
	}

	public void setW1_sig(String w1_sig) {
		this.w1_sig = w1_sig;
	}
    
    public String getMarital_status() {
		return marital_status;
	}

	public void setMarital_status(String marital_status) {
		this.marital_status = marital_status;
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
		

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public void setForm_id(Long form_id) {
		this.form_id = form_id;
	}

	public Long getForm_id() {
		return form_id;
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

}


//RS185540