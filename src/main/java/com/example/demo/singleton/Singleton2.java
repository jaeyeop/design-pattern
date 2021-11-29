package com.example.demo.singleton;

/*
 * 느리다.
 * Synchronized 는 메서드 접근 시 동기화 작업을 하여 위험하지는 않다.
 * 개 느리다. 실제로 약 100배 느려진다.
 * */
public class Singleton2 {
	private static Singleton2 singletonObject;
	
	private Singleton2() {}
	
	public static synchronized Singleton2 getSingletonObject() {
		if(singletonObject == null) {
			singletonObject = new Singleton2();
		}
		return singletonObject;
	}
}
