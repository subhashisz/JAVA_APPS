package com.myapp.programs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonSerializableDemo {
	static SingletonSerializable sing = SingletonSerializable.getInstance();
	static SingletonSerializable s1 = null;
	static SingletonSerializable s2 = null;

	public static void main(String[] args) {
		try (	ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("E:/singleton.ser"));
				ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("E:/singleton.ser"));
				ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("E:/singleton.ser"));) {

			out.writeObject(sing); //Serialized data is saved

			s1 = (SingletonSerializable) in1.readObject(); //deserializing
			s2 = (SingletonSerializable) in2.readObject(); //deserializing

			System.out.println(" s1 hashCode  : "+s1.hashCode() + " and i : " + s1.i + " | s2 hashCode : "+ s2.hashCode()+" and i : " + s2.i );
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}