package com.ezhu.builder.impl;

import com.ezhu.builder.Packing;

/**
 * 步骤2：创建了实现Packing接口的实体类；
 * @author Huyas
 *
 */
public class Bottle implements Packing {

	@Override
	public String pack() {
		return "Bottle";
	}

}
