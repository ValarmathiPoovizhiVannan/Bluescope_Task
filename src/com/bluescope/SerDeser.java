package com.bluescope;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Input implements Serializable{
	int id=1;
	String name="user";
}

public class SerDeser {
	public static void main(String[] args) throws IOException,ClassNotFoundException {
		
	
	Input in= new Input();
	FileOutputStream fo = new FileOutputStream("text.ser");
	ObjectOutputStream ob= new ObjectOutputStream(fo);
	ob.writeObject(in);
System.out.println("Serilization sucessfully done");
	
	FileInputStream fi = new FileInputStream("text.ser");
    ObjectInputStream inObj = new ObjectInputStream(fi);
    Input readObj = (Input) inObj.readObject();
	System.out.println(readObj.id);
	System.out.println(readObj.name);
	}
	
}
