package com.ezhu.singleton.demo2;

/**
 * 懒汉式单例模式
 * @author Huyas
 *
 */
public class LazySingleton {

	private static LazySingleton instance = null;

	private LazySingleton() {

	}

	public static LazySingleton getInstance() {
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}

}
