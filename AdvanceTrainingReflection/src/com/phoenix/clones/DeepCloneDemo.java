package com.phoenix.clones;



import com.phoenix.dates.MyDate;
import com.phoenix.models.Product;

public class DeepCloneDemo {
	public static void main(String[]args) 
	{
		Product product=new Product(3402,"Laptop","HP",350000.05f,new MyDate(12,7,2021));
		System.out.println(product);
		
		try {
			Product clonedProd =(Product) product.clone();
			System.out.println("clone of Product: "+clonedProd);
		
			MyDate originalMfgDate=product.getMfgDate();
			
			//get the clone of contained object Mfg Date
			MyDate clonedMfgDate = (MyDate) originalMfgDate.clone();
		    //deep copying  
		    clonedProd.setMfgDate(clonedMfgDate);
		    //changing the dd of Mfg Date of cloned Product
		    clonedProd.getMfgDate().setDd(25);
		
		System.out.println("Clone Product: "+clonedProd);
		System.out.println("Original Product: " + product);
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
