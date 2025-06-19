package com.java.practice.literals;

public class TypeOfVariable {
	static int x=4;
	int y=17;
	public static void main(String[] args) {
		TypeOfVariable a = new TypeOfVariable();

        int sum = x + a.y;
		System.out.println(x);
		System.out.println(a.y);
		System.out.println(sum);
	}
}
