package com.ezhu.abstractFactory;

import com.ezhu.abstractFactory.color.Color;
import com.ezhu.abstractFactory.color.impl.Blue;
import com.ezhu.abstractFactory.color.impl.Green;
import com.ezhu.abstractFactory.color.impl.Red;
import com.ezhu.factory.Shape;

/**
 * 步骤6：创建扩展了 AbstractFactory 的工厂类
 * @author Huyas
 *
 */
public class ColorFactory extends AbstractFactory {

	@Override
	Color getColor(String color) {
		if (color == null) {
			return null;
		}
		if (color.equalsIgnoreCase("RED")) { // 忽略大小写比对
			return new Red();
		} else if (color.equalsIgnoreCase("GREEN")) {
			return new Green();
		} else if (color.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}
		return null;
	}

	@Override
	Shape getShape(String shapeType) {
		return null;
	}

}
