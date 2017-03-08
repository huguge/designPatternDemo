package com.ezhu.abstractFactory;

import com.ezhu.abstractFactory.color.Color;
import com.ezhu.factory.Shape;

/**
 * 步骤5：为 Color 和 Shape 类创建抽象类来获取工厂
 * @author Huyas
 *
 */
public abstract class AbstractFactory {
	abstract Color getColor(String color);
	abstract Shape getShape(String shapeType);
}
