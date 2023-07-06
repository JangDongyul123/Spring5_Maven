package kr.ac.dongyul;

import lombok.Setter;

@Setter
public class KoreanPrinter implements PrinterType{
	
	private String brandName;
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("겨울이 끝나고 봄이 오길");
	}
}
