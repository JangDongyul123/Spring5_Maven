import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.ac.dongyul.Publisher;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("kr/ac/dongyul/conf/printer.xml");
		
		Publisher pb = (Publisher)context.getBean("id_PB");
		pb.usePrint();
	
		context.close();
	}
}
