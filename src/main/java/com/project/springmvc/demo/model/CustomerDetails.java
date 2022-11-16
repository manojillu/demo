package com.project.springmvc.demo.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CustomerDetails implements Serializable {

	private static final long serialVersionUID = 1L;
	

	private String fName;


	private String lName;


	private String email;


	private String pno;

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPno() {
		return pno;
	}

	public void setPno(String pno) {
		this.pno = pno;
	}

	
}
