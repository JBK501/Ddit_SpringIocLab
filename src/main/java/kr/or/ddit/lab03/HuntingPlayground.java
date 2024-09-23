package kr.or.ddit.lab03;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.or.ddit.lab03.objs.Hunter;
import kr.or.ddit.lab03.objs.HuntingDog;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HuntingPlayground {
	public static void main(String[] args) {
		
		try(
		    // GenericXmlApplicationContext 구현체 사용
			// classpath: 스프링이 알아서 컨텍스트 패스 찾음.
			ConfigurableApplicationContext context =
				new GenericXmlApplicationContext("classpath:kr/or/ddit/lab03/conf/lab03-context.xml");
		){
			context.registerShutdownHook();
			
			Hunter hunter1 = context.getBean(Hunter.class);
			Hunter hunter2 = context.getBean(Hunter.class);
			Hunter hunter3 = context.getBean(Hunter.class);
			
//			log.info("hunter1 == hunter2 : {}",hunter1 == hunter2);
		}
		
	}
}
