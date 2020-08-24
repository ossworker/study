package com.workoss.study.junit;
public class HelloServiceImpl {

	public Object testRtnObject(){
		return new Object();
	}

	public String testRtnString(){
		return "hello";
	}


	public String testThrowException(){
		throw new RuntimeException("test throw");
	}


	public int[] testRtnArray(){
		return new int[]{1,2,3};
	}

}
