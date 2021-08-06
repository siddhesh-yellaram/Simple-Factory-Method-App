package com.techlab.model;

public class TeslaFactory implements IAutoFactory{
	@Override
	public IAuto make() {
		return new Tesla();
	}
}
