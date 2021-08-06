package com.techlab.model;

public class Tesla implements IAuto{

	@Override
	public void start() {
		System.out.println("Car is starting");
	}

	@Override
	public void stop() {
		System.out.println("Car is stopping");
	}

	@Override
	public void getName() {
		System.out.println("Car name is Tesla");
	}
}
