package com.phoenix.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.phoenix.models.Product;

public class ReflectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class c=Class.forName("com.phoenix.models.ElectronicProduct");
			System.out.println("loaded");
			
			//creating object using reflection
			/*
			 * Product p=(Product)c.newInstance();
			 * System.out.println("reflection Created succesfully"); p.setId(1001);
			 * p.setName("Mobile"); p.setBrand("Samsung"); p.setPrice(19000.45f);
			 */
			
			//Field fArr[]=c.getFields();//only public fields
			Field fArr[]=c.getDeclaredFields();// only public data contained
			for(Field f:fArr)
			{
				//System.out.println(f.getName());
				System.out.println(f);
			}
			
			System.out.println("\n\nFetching all methods:");
			
			//Method mArr[]=c.getMethods();//only fetch public method
			Method mArr[]=c.getDeclaredMethods();
			for(Method f:mArr)
			{
				//System.out.println(f.getName());
				System.out.println(f);
			}
			
			
			System.out.println("\n\nfetch all public Constructors");
			//Constructor cArr[]=c.getConstructors();
			Constructor cArr[]=c.getDeclaredConstructors();
			for(Constructor f:cArr)
			{
				//System.out.println(f.getName());
				System.out.println(f);
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
