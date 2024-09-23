package kr.or.ddit.lab07.objs;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.or.ddit.lab01.objs.controller.DummyController;

public class Lab01Playground {
	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = 
				new ClassPathXmlApplicationContext("kr/or/ddit/lab07/conf/lab01-context.xml");
		
		context.registerShutdownHook();
		DummyController controller = context.getBean(DummyController.class);
		controller.receiveCommand("P10101");
	}
}
