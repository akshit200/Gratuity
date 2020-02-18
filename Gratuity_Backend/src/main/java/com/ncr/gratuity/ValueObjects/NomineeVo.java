package com.ncr.gratuity.ValueObjects;

import java.sql.Date;


public class NomineeVo {
	 
	    private String n_name;
	    
	    
	    private String n_address;
	    
	    
	    private String n_relation;
	    
	    
	    private Date n_dob;
	    
	   
	    private String n_amount;


		public String getN_amount() {
			return n_amount;
		}


		public void setN_amount(String n_amount) {
			this.n_amount = n_amount;
		}


		public Date getN_dob() {
			return n_dob;
		}


		public void setN_dob(Date n_dob) {
			this.n_dob = n_dob;
		}


		public String getN_relation() {
			return n_relation;
		}


		public void setN_relation(String n_relation) {
			this.n_relation = n_relation;
		}


		public String getN_address() {
			return n_address;
		}


		public void setN_address(String n_address) {
			this.n_address = n_address;
		}


		public String getN_name() {
			return n_name;
		}


		public void setN_name(String n_name) {
			this.n_name = n_name;
		}

}
