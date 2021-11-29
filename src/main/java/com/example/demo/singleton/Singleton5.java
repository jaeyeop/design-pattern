package com.example.demo.singleton;

/********
 * 
 * @author jyjeong
 * Lazy Loading + 원자성 보장
 * JVM의 클래스 초기화 과정에서 원자성을 보장하는 원리를 이용하는 방식
 * 
 * Since the class initialization phase is guaranteed by the JLS to be sequential, i.e., non-concurrent, no further synchronization is required in the static getInstance method during loading and initialization.
 */
public class Singleton5 {
	private Singleton5() {}
	
	private static class SingletonHolder {
		public static final Singleton5 INSTANCE = new Singleton5();
	}
	
	public static Singleton5 getSingletonObject() {
		return SingletonHolder.INSTANCE;
	}
}
