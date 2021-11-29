package com.example.demo.singleton;

/****
 * 
 * @author jyjeong
 * 프로그램이 실행되고 나서 처음부터 끝까지 객체가 메모리에 있게 된다.
 * 인스턴스를 사용하지 않아도 메모리가 점유되어 비효율적일 수 있다.
 */
public class Singleton4 {
	private static volatile Singleton4 singletonObject = new Singleton4();
	
	private Singleton4() {}
	
	public static Singleton4 getSingleObject() {
		return singletonObject;
	}
}
