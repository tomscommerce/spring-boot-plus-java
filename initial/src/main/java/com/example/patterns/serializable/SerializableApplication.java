package com.example.patterns.serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.UUID;

public class SerializableApplication {

	public static void main(String[] args) throws IOException {
		MySerializable serializable = new MySerializable(UUID.randomUUID(),"tom");
		System.out.println(serializable);
		FileOutputStream fos = new FileOutputStream("streamFile");
		try ( ObjectOutputStream oos = new ObjectOutputStream(fos) ) {
			oos.writeObject(serializable);
		}
	}

}
