import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.test.People;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("/kr/xmltest/test.xml");
		People test = (People)context.getBean("testBean");
		System.out.println(test.getSatisfaction());
		
	}
}
