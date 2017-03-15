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
		
		// 第一次编写的
//		if (instance == null) {
//			instance = new LazySingleton();
//		}
		
		// 作一定的改进
//		if (instance == null) {
//			synchronized (LazySingleton.class) {
//				instance = new LazySingleton();
//			}
//		}
		
		// 完整代码 - 双重检查锁定懒汉式单例
		// 第一重判断
		if (instance == null) {
			// 锁定代码块
			synchronized (LazySingleton.class) {
				// 第二重判断
				if (instance == null) {
					instance = new LazySingleton();// 创建单例实例
				}
			}
		}
		return instance;
	}

}
