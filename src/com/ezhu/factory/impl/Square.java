package com.ezhu.factory.impl;

import com.ezhu.factory.Shape;

/**
 * 步骤2：创建实现接口的实体类
 * @author Huyas
 *
 */
public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}

}
