package com.ezhu.singleton.demo1;



/**
 * 这种方式能达到双检锁方式一样的功效，但实现简单。对静态域使用延迟初始化，
 * 应使用这种方式而不是双检锁方式。这种方式只适用于静态域的情况，双检锁方式可在实例域需要延迟初始化使用。
 * 
 * @author Huyas
 *
 */
public class Singleton5 {

	private static class SingletonHolder {
		private static final Singleton5 INSTANCE = new Singleton5();
	}
	
	private Singleton5() {}
	
	public static final Singleton5 GetInstance() {
		return SingletonHolder.INSTANCE;
	}
	
}
