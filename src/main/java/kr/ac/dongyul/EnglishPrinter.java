package kr.ac.dongyul;

import lombok.*;

@Setter
public class EnglishPrinter implements PrinterType {
	
	private String brandName;

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("May winter end and spring come");
	}
}
