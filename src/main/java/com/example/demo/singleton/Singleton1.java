package com.example.demo.singleton;

/* Singleton ver1
 * Mulit-Thread 환경에서 싱글턴 패턴을 적용하다보면 문제가 발생할 수 있다.
 * 동시에 접근하다가 하나만 생성되어야 하는 인스턴스가 두 개 생성될 수 있는 것이다.
 * getSingletonObject() Method를 동기화시켜야 멀티스레딩 문제가 해결된다.
 */
public class Singleton1 {
	private static Singleton1 singletonObject;
	
	private Singleton1() {}
	
	public static Singleton1 getSingletonObject() {
		if(singletonObject == null) {
			singletonObject = new Singleton1();
		}
		return singletonObject;
	}
}
