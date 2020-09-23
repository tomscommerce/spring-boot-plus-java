package com.example.patterns.state;

public class StopState implements State {

	@Override
	public void process(Context context) {
		System.out.println("Player is in stop state");
		context.setState(this);		
	}

}
