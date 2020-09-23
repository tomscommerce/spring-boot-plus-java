package com.example.patterns.finalexample;

public class FinalImmutableReadOnly {

	public String email;

	public FinalImmutableReadOnly(String email) {
		this.email = email;
	}

	public void setEmail(String string) {
		//this.email = string;		
	}

	public String getEmail() {
		return email;
	}

}
