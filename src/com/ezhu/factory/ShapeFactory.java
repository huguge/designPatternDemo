package com.ezhu.factory;

import com.ezhu.factory.impl.Circle;
import com.ezhu.factory.impl.Rectangle;
import com.ezhu.factory.impl.Square;

/**
 * 步骤 3：创建一个工厂，生成基于给定信息的实体类对象
 * @author Huyas
 *
 */
public class ShapeFactory {

	/*
	 * 使用 getShape 方法获取形状类型的对象
	 */
	public Shape getShape(String shapeType) {
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
	
}
