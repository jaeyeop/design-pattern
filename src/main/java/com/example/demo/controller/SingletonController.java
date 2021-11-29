package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.singleton.Singleton1;
import com.example.demo.singleton.Singleton2;
import com.example.demo.singleton.Singleton5;

@RestController
@RequestMapping("/v1")
public class SingletonController {
	
	@GetMapping("/singleton1")
	public int getSingletonObject() {
		Singleton1 singleton = Singleton1.getSingletonObject();
		System.out.println("1 : " + singleton.hashCode());
		
		return singleton.hashCode();
	}
	
	@GetMapping("/singleton2")
	public int getSingleton2Object() {		
		Singleton2 singleton = Singleton2.getSingletonObject();
		System.out.println("2 : " + singleton.hashCode());
		
		return singleton.hashCode();
	}
	
	@GetMapping("/singleton5")
	public int getSingleton5Object() {		
		Singleton5 singleton = Singleton5.getSingletonObject();
		System.out.println("5 : " + singleton.hashCode());
		
		return singleton.hashCode();
	}

}
