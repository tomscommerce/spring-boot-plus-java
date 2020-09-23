package com.example.patterns.state;

public class StartState implements State {

	@Override
	public void process(Context context) {
		System.out.println("Player is in start state");
		context.setState(this);	
		context.process();
	}

}
