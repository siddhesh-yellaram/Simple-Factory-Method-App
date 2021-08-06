package com.techlab.test;


import com.techlab.model.AudiFactory;
import com.techlab.model.IAuto;
import com.techlab.model.IAutoFactory;

public class AutoMobileTest {

	public static void main(String[] args) {
		IAutoFactory factory = new AudiFactory();
		IAuto auto = factory.make();
		auto.start();
		auto.stop();
		auto.getName();
	}
}
