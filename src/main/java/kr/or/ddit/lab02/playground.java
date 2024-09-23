package kr.or.ddit.lab02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.or.ddit.lab02.objs.Foo;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class playground {
	public static void main(String[] args) {
		
		try(
			ConfigurableApplicationContext context =
			new ClassPathXmlApplicationContext("kr/or/ddit/lab02/conf/lab02-context.xml");
		){
			// 셧다운
			// 어플리케이션이 언젠가는 종료되어야 한다. (공장을 부숴야한다.)
			// 어플리케이션 안에서 run demon thread(활성스레드) 를 찾는다.
			// 활성스레드가 하나도 없다면, 알아서 셧다운시킨다.
			context.registerShutdownHook();
			
			Foo foo1 = context.getBean(Foo.class);
			Foo foo2 = context.getBean(Foo.class);
//			Foo foo3 = context.getBean(Foo.class);
//			log.info("주입된 객체 : {}",foo1);
//			log.info("foo1 == foo2 : {}",foo1==foo2);
//			log.info("foo1 == foo3 : {}",foo1==foo3);
		}
	}
	
}
