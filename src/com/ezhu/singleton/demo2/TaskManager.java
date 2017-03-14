package com.ezhu.singleton.demo2;

public class TaskManager {

	// 创建并保存唯一实例
	private static TaskManager tm = null;
	
	/*
	 * 初始化窗口
	 * 为了保证实例的唯一性，进制外部进行实例化，所以，将构造函数的可见性改为private
	 */
	private TaskManager() {
		
	}
	
	/*
	 * 显示进程
	 */
	public void displayProcesses() {
		
	}
	
	/*
	 * 显示服务
	 */
	public void displayServices() {
		
	}
	
	/*
	 * 使用公有的静态方法使外界可以访问这个唯一实例
	 */
	public static TaskManager getInstance() {
		if (tm == null) {
			tm = new TaskManager();
		}
		return tm;
	}
	
}
