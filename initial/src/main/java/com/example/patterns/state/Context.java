package com.example.patterns.state;

public class Context {

	private State state;
	
	public void setState(State state) {
		this.state = state;
	}

	public Object getState() {
		return state;
	}

	public void process() {
		
	}

}
