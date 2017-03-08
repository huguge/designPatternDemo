package com.ezhu.abstractFactory.color.impl;

import com.ezhu.abstractFactory.color.Color;

public class Red implements Color {

	@Override
	public void fill() {
		System.out.println("Inside Red::fill() method.");
	}

}
