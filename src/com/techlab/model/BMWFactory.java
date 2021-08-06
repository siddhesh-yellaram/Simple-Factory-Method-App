package com.techlab.model;

public class BMWFactory implements IAutoFactory{
	@Override
	public IAuto make() {
		return new BMW();
	}
}
