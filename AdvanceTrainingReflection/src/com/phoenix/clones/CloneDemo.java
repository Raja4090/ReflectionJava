package com.phoenix.clones;

import com.phoenix.dates.MyDate;
import com.phoenix.models.Product;

public class CloneDemo {

	public static void main(String[]args)
	{
		Product product=new Product(3402,"Laptop","HP",350000.05f,new MyDate(10,7,2021));
		
		try {
			Product cloneProd=(Product)product.clone();
			System.out.println(cloneProd);
			Product cloneCloned=(Product)cloneProd.clone();
			System.out.println(cloneCloned);
			
			cloneProd.getMfgDate().setDd(25);
			System.out.println(cloneProd);
			
			
			
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
