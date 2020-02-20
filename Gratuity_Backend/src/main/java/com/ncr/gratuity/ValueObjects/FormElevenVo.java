package com.ncr.gratuity.ValueObjects;

import java.util.Date;

import javax.persistence.Column;

public class FormElevenVo {
	
	private String first_name;
    private String last_name;
    private String father_name;
    private String gender;
    private String marital_status;
    private String Email_Id;
    private String Mobile_no;
    private Boolean Scheme_1952;
    private Boolean Scheme_1955;
    private Boolean International_worker;
    private String IFS_Code;
    private String Aadhar_no;
    private String PAN_no;
	
	private byte[] ifsCode;
	private byte[] aadharCard;
    private byte[] panCard;
	
    private String account_no;
    private String pf_no;
    private Date exit_date;
    private String certificate_no;
    private String ppo_no;
    private String country_origin;
    private String passport_no;
    
    public String getAccount_no() {
		return account_no;
	}
	public void setAccount_no(String account_no) {
		this.account_no = account_no;
	}
	public String getPf_no() {
		return pf_no;
	}
	public void setPf_no(String pf_no) {
		this.pf_no = pf_no;
	}
	public Date getExit_date() {
		return exit_date;
	}
	public void setExit_date(Date exit_date) {
		this.exit_date = exit_date;
	}
	public String getCertificate_no() {
		return certificate_no;
	}
	public void setCertificate_no(String certificate_no) {
		this.certificate_no = certificate_no;
	}
	public String getPpo_no() {
		return ppo_no;
	}
	public void setPpo_no(String ppo_no) {
		this.ppo_no = ppo_no;
	}
	public String getCountry_origin() {
		return country_origin;
	}
	public void setCountry_origin(String country_origin) {
		this.country_origin = country_origin;
	}
	public String getPassport_no() {
		return passport_no;
	}
	public void setPassport_no(String passport_no) {
		this.passport_no = passport_no;
	}
	public Long getValidity_passport() {
		return validity_passport;
	}
	public void setValidity_passport(Long validity_passport) {
		this.validity_passport = validity_passport;
	}
	private Long validity_passport;
    
	
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
	public String getMarital_status() {
		return marital_status;
	}
	public void setMarital_status(String marital_status) {
		this.marital_status = marital_status;
	}
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
	
	public byte[] getIfsCode() {
		return ifsCode;
	}
	public void setIfsCode(byte[] ifsCode) {
		this.ifsCode = ifsCode;
	}
	public byte[] getAadharCard() {
		return aadharCard;
	}
	public void setAadharCard(byte[] aadharCard) {
		this.aadharCard = aadharCard;
	}
	public byte[] getPanCard() {
		return panCard;
	}
	public void setPanCard(byte[] panCard) {
		this.panCard = panCard;
	}
    
    

}
