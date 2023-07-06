package kr.ac.dongyul;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.AllArgsConstructor;

//생성자를 대신해주는 어노테이션
//@AllArgsConstructor

public class Publisher {
	
	@Autowired
	@Qualifier(value="qf_KP")
	private PrinterType printer1;
	//private PrinterType printer2;
	
	public void usePrint() {
		printer1.print();
	}
	
}
