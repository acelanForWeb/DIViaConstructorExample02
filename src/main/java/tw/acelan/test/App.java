package tw.acelan.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.acelan.common.Customer;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml") ;
		Customer customer = (Customer)context.getBean("CustomerBean");
		System.out.println(customer);
	}
}

