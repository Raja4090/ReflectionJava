package com.phoenix.models;

public class ElectronicProduct extends Product {

	public int electronicId;
	public String label;
	
	public ElectronicProduct()
	{
		
	}
	
	
	public ElectronicProduct(int electronicId, String label) {
		super();
		this.electronicId = electronicId;
		this.label = label;
	}


	public int getElectronicId() {
		return electronicId;
	}
	public void setElectronicId(int electronicId) {
		this.electronicId = electronicId;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	
}
