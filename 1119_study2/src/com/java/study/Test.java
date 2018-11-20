package com.java.study;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Base64;

//main 
public class Test {
	static String base64Person = "";
	
	public static void main(String[] args) {
		Person p = new Person("홍길동", 'M');
		Student s = new Student("홍길동", 'M', "s001");
		Teacher t = new Teacher("홍길순", 'F', "t001", "컴퓨터");
		
		//직렬화 예제
		byte[] serializedPerson;
		try(ByteArrayOutputStream baos = new ByteArrayOutputStream()){
			try(ObjectOutputStream oos = new ObjectOutputStream(baos)){
				oos.writeObject(p);
				serializedPerson = baos.toByteArray();
				base64Person = Base64.getEncoder().encodeToString(serializedPerson);
				System.out.println(base64Person);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		System.out.println(base64Person);
		System.out.println(s);
		System.out.println(t);
		
		//역직렬화 예제
		byte[] serializedPerson2 = Base64.getDecoder().decode(base64Person);
		try(ByteArrayInputStream bais = new ByteArrayInputStream(serializedPerson2)){
			try(ObjectInputStream ois = new ObjectInputStream(bais)){
				//역직렬화된 객체 읽어옴.
				Object objectPerson = ois.readObject();
				Person p2 = (Person) objectPerson;
				System.out.println("serialized: "+p2);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
	}
}
