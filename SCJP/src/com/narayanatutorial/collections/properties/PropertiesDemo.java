package com.narayanatutorial.collections.properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("/home/narayana/Documents/abc.properties");
		p.load(fis);
		System.out.println("propety file data:"+p);
		String s = p.getProperty("tutorialName");
		System.out.println("tutorialName parameter value:"+s);
		p.setProperty("Location", "Bangalore");
		FileOutputStream fos = new FileOutputStream("/home/narayana/Documents/abc.properties");
		p.store(fos, " updated by Narayanatutorial");
		String loc=p.getProperty("Location");
		System.out.println("Location parameter value:"+loc);
		
	}

}
