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
    private long emp_no;
    
    
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

	public long getEmp_no() {
		return emp_no;
	}

	public void setEmp_no(long emp_no) {
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