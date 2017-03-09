package com.ezhu.builder;

/**
 * 步骤1：创建一个表示食物条目的接口；
 * @author Huyas
 *
 */
public interface Item {

	public String name();

	public Packing packing();

	public float price();

}
