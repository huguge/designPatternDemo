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
			// 第一次编写的
//			instance = new LazySingleton();
			// 作一定的改进
			synchronized (LazySingleton.class) {
				instance = new LazySingleton();
			}
		}
		return instance;
	}

}
