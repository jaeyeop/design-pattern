package com.example.demo.singleton;

/**
 * 
 * @author jyjeong
 * DCL(Double Checking Locking)
 * volatile -> field no cache. 무조건 갱신 값 사용
 * volatile -> 컴파일러가 특정 변수에 대해 캐싱을 적용하지 못하도록 하는 키워드이다.
 * 멀티스레딩환경에서 동기화를 해주는 키워드이다.
 * volatile Vs. synchronized
 * volatile(특정 변수 최신값 제공), synchronized(작업 자체를 원자화)
 * CPU는 RAM만을 사용하지 않는다.
 * Mulit-Core 환경에서는 각 코어는 전용 레지스터와 캐시를 가지는데 동기화 문제가 발생한다.
 *
 */
public class Singleton3 {
	private static volatile Singleton3 singletonObject;
	
	private Singleton3() {}
	
	public static Singleton3 getSingletonObject() {
		if(singletonObject == null) {
			synchronized (Singleton3.class) {
				if(singletonObject == null) {
					singletonObject = new Singleton3();
				}
			}
		}
		return singletonObject; 
	}
	

}
