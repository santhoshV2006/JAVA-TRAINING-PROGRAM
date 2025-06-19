package com.java.practice.opps;
class Super1{
	String str = "KVIT";
	public void welcome() {
		System.out.println("Welcome to KVIT");
	}
}
class Child1 extends Super1 {
	String str = "Kongu";
	public void welcome() {
		System.out.println("Welcome to Kongu");
	}
}
public class Inheritance1 {
	public static void main(String[] args) {
		Super1 sup = new Child1();
		sup.welcome();
		System.out.println(sup.str);
	}
}
