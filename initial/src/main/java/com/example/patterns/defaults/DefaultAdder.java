package com.example.patterns.defaults;

public interface DefaultAdder {

	@SuppressWarnings("unchecked")
	public default <K extends Number> K addNumbers(K a, K b) {
		if (a instanceof Integer) {
			Integer cc = (Integer)a + (Integer)b;
			return (K) cc;
		}
		throw new UnsupportedOperationException("type of a or b is not known");

	}

	
}
