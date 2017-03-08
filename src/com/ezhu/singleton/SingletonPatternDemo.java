package com.ezhu.singleton;

public class SingletonPatternDemo {
	public static void main(String[] args) {
		
		// 获取唯一可用的对象
		SingleObject singleObject = SingleObject.getInstance();
		
		// 显示消息
		singleObject.showMessage();
	}
}
