package com.ezhu.singleton.demo1;

/**
 * 双检锁/双重校验锁 (double-checking locking)
 * @desc:这种方式采用双锁机制，安全且在多线程下能保持高性能
 * getInstance()的性能对应用程序很关键
 * @author Huyas
 *
 */
public class Singleton4 {

	private volatile static Singleton4 instance;
	
	private Singleton4() {}
	
	public static Singleton4 getInstance() {
		if (instance == null) {
			synchronized (Singleton4.class) {
				if (instance == null) {
					instance = new Singleton4();
				}
			}
		}
		return instance;
	}
	
}
