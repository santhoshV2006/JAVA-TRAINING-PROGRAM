package com.java.practice.opps;

interface X{
	public void Teach();
}
interface Y{
	public void Teach();
}
class testing implements X{
	public void teach() {
		System.out.println("A is teaching");
	}
}
class gnitset implements Y{
	public void teach() {
		System.out.println("B is teaching");
	}
}
public class InheritTeach {
	public static void main(String[] args) {
		 testing a1 = new testing();
		 a1.teach();
		 gnitset b1 = new gnitset();
		 b1.teach();
		 
	}
}
