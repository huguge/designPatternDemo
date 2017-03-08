package com.ezhu.abstractFactory.color.impl;

import com.ezhu.abstractFactory.color.Color;

public class Blue implements Color {

	@Override
	public void fill() {
		System.out.println("Inside Blue::fill() method.");
	}

}
