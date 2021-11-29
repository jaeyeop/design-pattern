package com.example.demo.singleton;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SingletonTest {	

	@Test
	public void singleton1Test() {
		Singleton1 singleton = Singleton1.getSingletonObject();
		Singleton1 singletonTest = Singleton1.getSingletonObject();
		
		assertThat(singleton).isEqualTo(singletonTest);
	}
	
	@Test
	@DisplayName("Singleton Holder")
	public void singletonTestByHolderClass() {
		Singleton5 singleton = Singleton5.getSingletonObject();
		Singleton5 singletonTest = Singleton5.getSingletonObject();
		
		assertThat(singleton).isEqualTo(singletonTest);
	}
}
