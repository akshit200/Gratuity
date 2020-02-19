package com.ncr.gratuity.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
@Entity
@Table(name="NomineeFields")
public class NomineeList {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long NomineeID;
	
	@JsonBackReference
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="form_id", nullable=false)
	private FormModel formModel;
	
	
    @Column(name= "n_name")
    private String n_name;
    
    @Column(name= "n_address")
    private String n_address;
    
    @Column(name= "n_relation")
    private String n_relation;
    
    @Column(name= "n_dob")
    private Date n_dob;
    
    @Column(name= "n_amount")
    private String n_amount;

	public FormModel getFormModel() {
		return formModel;
	}

	public void setFormModel(FormModel formModel) {
		this.formModel = formModel;
	}

	public Long getNomineeID() {
		return NomineeID;
	}

	public void setNomineeID(Long nomineeID) {
		NomineeID = nomineeID;
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

	public Date getN_dob() {
		return n_dob;
	}

	public void setN_dob(Date n_dob) {
		this.n_dob = n_dob;
	}

	public String getN_amount() {
		return n_amount;
	}

	public void setN_amount(String n_amount) {
		this.n_amount = n_amount;
	}

}
