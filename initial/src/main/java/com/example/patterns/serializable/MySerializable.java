package com.example.patterns.serializable;

import java.io.Serializable;
import java.util.UUID;

public class MySerializable implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private UUID id;
	private String name;

	public MySerializable(UUID id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "MySerializable [id=" + id + ", name=" + name + "]";
	}

	public Object getId() {
		return id;
	}

}
