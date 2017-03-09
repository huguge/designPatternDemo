package com.ezhu.builder.impl;

import com.ezhu.builder.Item;
import com.ezhu.builder.Packing;

/**
 * 步骤3：创建实现 Item 接口的抽象类，该类提供了默认接口
 * @author Huyas
 *
 */
public abstract class CodeDrink implements Item {

	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();

}
