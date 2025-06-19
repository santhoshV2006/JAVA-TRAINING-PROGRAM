package com.java.practice.opps;

class Parent {
	 static void greet(String name) {
		System.out.println("Get up and study : "+name);
	}
}
class Child extends Parent{
	static void greet(String name) {
		System.out.println("Chillax :"+name);
	}
}
public class TestInheritance {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.greet("AAA");
	}
}
