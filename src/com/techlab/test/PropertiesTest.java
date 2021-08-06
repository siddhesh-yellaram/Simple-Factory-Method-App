package com.techlab.test;

import java.util.*;
import java.io.*;

public class PropertiesTest {

	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("D:/test/swabhav_java/simple-factory-method/resources/config.properties");  
		Properties p = new Properties();
		p.load(reader);
		System.out.println("Name: "+p.getProperty("username"));
		System.out.println("Favourite Game: "+p.getProperty("favGame"));
		System.out.println("Favourite Book: "+p.getProperty("favBook"));
		System.out.println("Book Author: "+p.getProperty("favBookAuthor"));
	}

}
