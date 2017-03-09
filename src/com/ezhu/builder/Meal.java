package com.ezhu.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 步骤5：创建一个 Meal 类，带有前边定义的 Item 对象
 * @author Huyas
 *
 */
public class Meal {

	private List<Item> items = new ArrayList<Item>();
	
	public void addItem(Item item) {
		items.add(item);
	}

	public float getCost() {
		float cost = 0.0f;
		for (Item item : items) {
			cost += item.price();
		}
		return cost;
	}
	
	public void showItems() {
		for (Item item : items) {
			System.out.print("Item：" + item.name());
			System.out.print(", Packing：" + item.packing().pack());
			System.out.println(", Price：" + item.price());
		}
	}
	
}
