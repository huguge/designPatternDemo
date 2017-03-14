package com.ezhu.singleton.demo2;

/**
 * 饿汉式单例模式
 * @author Huyas
 *
 */
public class EagerSingleton {

	private static EagerSingleton instance = new EagerSingleton();
	
	private EagerSingleton() {
		
	}
	
	public static EagerSingleton getInstance() {
		return instance;
	}
	
}
