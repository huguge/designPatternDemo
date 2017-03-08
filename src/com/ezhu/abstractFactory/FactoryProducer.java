package com.ezhu.abstractFactory;


/**
 * 步骤7：创建一个工厂类创造器/生成器，通过传递形状和颜色信息来获取工厂。
 * @author Huyas
 *
 */
public class FactoryProducer {
	public static AbstractFactory getFactory(String choice) {
		if (choice == null) {
			return null;
		}
		if (choice.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactory();
		} else if (choice.equalsIgnoreCase("COLOR")) {
			return new ColorFactory();
		}
		
		return null;
	}
}
