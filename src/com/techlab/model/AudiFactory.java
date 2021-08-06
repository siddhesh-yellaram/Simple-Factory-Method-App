package com.techlab.model;

public class AudiFactory implements IAutoFactory{
	@Override
	public IAuto make() {
		return new Audi();
	}
}
