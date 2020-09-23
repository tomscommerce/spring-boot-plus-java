package com.example.animal;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.UUID;

import org.junit.Test;

import com.example.patterns.serializable.MySerializable;

public class SerializableTest {
	
	@Test
	public void testSerializable() throws IOException, ClassNotFoundException {
		
		UUID randomUUID = UUID.randomUUID();
		MySerializable serializable = new MySerializable(randomUUID,"tom");
		System.out.println(serializable);
		FileOutputStream fos = new FileOutputStream("streamFile");
		try ( ObjectOutputStream oos = new ObjectOutputStream(fos) ) {
			oos.writeObject(serializable);
		}
		
		FileInputStream fis = new FileInputStream("streamFile");
		try ( ObjectInputStream ois = new ObjectInputStream(fis) ) {
			MySerializable newSerializable = (MySerializable) ois.readObject();
			assert(newSerializable.getId().equals(randomUUID));
			System.out.println(newSerializable.toString());
		}
	}

}
