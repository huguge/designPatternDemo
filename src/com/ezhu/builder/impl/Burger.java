package com.ezhu.builder.impl;

import com.ezhu.builder.Item;
import com.ezhu.builder.Packing;

/**
 * 步骤3：创建实现 Item 接口的抽象类，该类提供了默认功能
 * @author Huyas
 *
 */
public abstract class Burger implements Item {

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();

}
