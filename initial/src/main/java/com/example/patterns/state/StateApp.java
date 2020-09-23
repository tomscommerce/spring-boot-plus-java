package com.example.patterns.state;

public class StateApp {

	public static void main(String[] args) {
		Context context = new Context();
		StartState startState = new StartState();
		startState.process(context);
		System.out.println(context.getState().toString());
		StopState stopState = new StopState();
		stopState.process(context);
		System.out.println(context.getState().toString());

	}

}
