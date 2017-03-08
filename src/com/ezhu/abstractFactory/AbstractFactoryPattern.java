package com.ezhu.abstractFactory;

import com.ezhu.abstractFactory.color.Color;
import com.ezhu.factory.Shape;

public class AbstractFactoryPattern {

	/*
	 * 1、创建各种接口--Shape、Color等；
	 * 2、创建实现接口的实体类 --Rectangle、Red等；
	 * 3、为接口对象创建抽象类来获取工厂--AbstractFactory；
	 * 4、创建扩展了 AbstractFactory 的工厂类，基于给定的信息生成实体类的对象--ShapeFactory、ColorFactory等； 
	 * 5、创建一个工厂创造器/生成器类（FactoryProducer），通过传递颜色/形状信息来获取工厂；
	 * 6、通过FactoryProducer来获取AbstractFactory，通过传递类型信息来获取实体类对象；
	 * 7、验证输出。
	 */
	
	public static void main(String[] args) {

		// 获取形状工厂
		ShapeFactory shapeFactory = (ShapeFactory) FactoryProducer.getFactory("shape");

		// 获取形状为 Circle 的对象
		Shape shape1 = shapeFactory.getShape("CIRCLE");

		// 调用 Circle 的 draw 方法
		shape1.draw();

		// 获取形状为 Rectangle 的对象
		Shape shape2 = shapeFactory.getShape("RECTANGLE");

		// 调用 Rectangle 的 draw 方法
		shape2.draw();

		// 获取形状为 Square 的对象
		Shape shape3 = shapeFactory.getShape("SQUARE");

		// 调用 Square 的 draw 方法
		shape3.draw();

		// 获取颜色工厂
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

		// 获取颜色为 Red 的对象
		Color color1 = colorFactory.getColor("RED");

		// 调用 Red 的 fill 方法
		color1.fill();

		// 获取颜色为 Green 的对象
		Color color2 = colorFactory.getColor("Green");

		// 调用 Green 的 fill 方法
		color2.fill();

		// 获取颜色为 Blue 的对象
		Color color3 = colorFactory.getColor("BLUE");

		// 调用 Blue 的 fill 方法
		color3.fill();

	}

}
