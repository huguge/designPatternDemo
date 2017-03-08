package com.ezhu.abstractFactory.color.impl;

import com.ezhu.abstractFactory.color.Color;

public class Green implements Color {

	@Override
	public void fill() {
		System.out.println("Inside Green::fill() method.");
	}

}
