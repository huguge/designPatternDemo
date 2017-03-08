package com.ezhu.singleton;

/**
 * 枚举
 * @desc:这种实现方式还没有被广泛使用，但这是实现单例模式的最佳方法。
 * 它更简洁，自动支持序列化机制，绝对防止多次实例化
 * 
 * 经验之谈：一般情况下，不建议使用第 1 种和第 2 种懒汉方式，建议使用第 3 种饿汉方式。
 * 只有在要明确实现 lazy loading 效果时，才会使用第 5 种登记方式。
 * 如果涉及到反序列化创建对象时，可以尝试使用第 6 种枚举方式。
 * 如果有其他特殊的需求，可以考虑使用第 4 种双检锁方式。
 * @author Huyas
 *
 */
public enum Singleton6 {
	INSTANCE;
	public void whateverMethod() {
		
	}
}
