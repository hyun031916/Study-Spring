package kr.hs.study.main;

import kr.hs.study.beans.Person;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("lee", 25);
		
//		p.setName("kim");
//		p.setAge(30);
		
		System.out.println("Name: "+p.getName());
		System.out.println("Age: "+p.getAge());
		
//		p1.setName("kim");
//		p1.setAge(30);
//		
//		System.out.println("Name: "+p1.getName());
//		System.out.println("Age: "+p1.getAge());
	}

}
