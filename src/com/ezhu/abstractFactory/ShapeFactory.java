package com.ezhu.abstractFactory;

import com.ezhu.abstractFactory.color.Color;
import com.ezhu.factory.Shape;
import com.ezhu.factory.impl.Circle;
import com.ezhu.factory.impl.Rectangle;
import com.ezhu.factory.impl.Square;

/**
 * 步骤6：创建扩展了 AbstractFactory 的工厂类
 * @author Huyas
 *
 */
public class ShapeFactory extends AbstractFactory {

	@Override
	Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) { // 忽略大小写比对
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}
	
	@Override
	Color getColor(String color) {
		
		return null;
	}

}
