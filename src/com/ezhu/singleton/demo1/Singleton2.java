package com.ezhu.singleton.demo1;

/**
 * 懒汉式，线程安全
 * @author Huyas
 *
 */
public class Singleton2 {

	private static Singleton2 instance;
	
	private Singleton2() {}
	
	/*
	 * 必须加锁 synchronized 才能保证实例单例，但加锁会影响效率 
	 */
	public static synchronized Singleton2 getInstance() {
		if (instance == null) {
			instance = new Singleton2();
		}
		return instance;
	}
	
}
