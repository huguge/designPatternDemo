package com.ezhu.factory;

/**
 * 步骤4：使用该工厂，通过传递类型信息来获取实体类的对象
 * @author Huyas
 *
 */
public class FactoryPatternDemo {

	/*
	 * 1、创建接口，并添加方法；
	 * 2、创建继承上边接口的实体类，并在重写的方法里做具体的实现；
	 * 3、创建工厂类，编写方法使外部根据实例名称获取需要的实例；
	 * 4、完成需求（创建对象时，不会对客户端暴露创建逻辑）。
	 */
	
	public static void main(String[] args) {
		
		ShapeFactory sf = new ShapeFactory();
		
		// 获取 Cricle 对象，并调用它的 draw 方法
		Shape circle = sf.getShape("circle");
		// 调用 Circle 的 draw 方法
		circle.draw();
		
		// 获取 Rectangle 对象，并调用它的 draw 方法
		Shape rectangle = sf.getShape("rectangle");
		// 调用 Rectangle 的 draw 方法
		rectangle.draw();
		
		// 获取Square 对象，并调用它的 draw 方法
		Shape square = sf.getShape("square");
		// 调用 Square 的 draw 方法
		square.draw();
	}
	
}
