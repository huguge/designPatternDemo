package com.ezhu.singleton;

/**
 * 饿汉式
 * 描述：这种方法比较常用，但容易产生垃圾对象
 * 优点：没有加锁，执行效率会提高
 * 缺点：类加载就初始化，浪费内存
 * @author Huyas
 *
 */
public class Singleton3 {

	private static Singleton3 instance = new Singleton3();
	
	private Singleton3() {}
	
	public static Singleton3 getInstance() {
		return instance;
	}
	
}
