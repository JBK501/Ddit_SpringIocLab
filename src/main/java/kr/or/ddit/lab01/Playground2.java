package kr.or.ddit.lab01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.or.ddit.lab01.objs.controller.DummyController;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Playground2 {
	public static void main(String[] args) {
		// 컨테이너는 어플리케이션 종료시 자동 종료될 수 있어야 함.
		
		try(
			ConfigurableApplicationContext context =
				new ClassPathXmlApplicationContext("kr/or/ddit/lab01/conf/lab01-context.xml");
		){
			context.registerShutdownHook();
			DummyController bean = context.getBean(DummyController.class);
			String param = "P10103";
			bean.receiveCommand(param);
		}
		
	}
}
