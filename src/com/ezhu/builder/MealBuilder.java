package com.ezhu.builder;

import com.ezhu.builder.impl.ChickenBurger;
import com.ezhu.builder.impl.Coke;
import com.ezhu.builder.impl.Pepsi;
import com.ezhu.builder.impl.VegBurger;

/**
 * 步骤6：创建一个 MealBuilder 类，实际的 Builder 类负责创建 Meal 对象。
 * @author Huyas
 *
 */
public class MealBuilder {

	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}
	
	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
	
}
