package kr.or.ddit.lab01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.or.ddit.lab01.objs.controller.DummyController;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Playground {
	public static void main(String[] args) {
		
		// new는 딱 한번은 있어야 한다.
		ApplicationContext container
			 = new ClassPathXmlApplicationContext("/kr/or/ddit/lab01/conf/dummy-context.xml");
		
		DummyController controller = container.getBean(DummyController.class);
		String param = "p10101";
		controller.receiveCommand(param);
	}
}
