package com.learnjava;

public class Test {
	

	public int  add() {
		int a = 10 ;
		int b = 20 ;
		return a+b;

	
	public int sub() {
		int a = 50 ;
		int b = 20 ;
		return a-b;
	}

	public static void main(String[] args) {
		
		Test t = new Test();
		t.add();
		t.sub();

	}

}
