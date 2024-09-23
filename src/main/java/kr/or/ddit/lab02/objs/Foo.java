package kr.or.ddit.lab02.objs;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
//@Data
public class Foo {
	private final int number; // required 관계 (final 붙음)
	private boolean flag; // optional 관계
	@Autowired
	private Bar bar; // optional 관계
	private final Baz baz; // required 관계

	// 생성자 주입 (required 관계에서 사용)
	// 생성자는 반드시 호출하기 때문
	public Foo(Baz baz, @Value("5") int number) {
		this.baz = baz;
		this.number = number;
		log.info("Foo 객체가 파라미터 있는 생성자로 생성됐음.");
	}
	
	// setter 주입 (optional 관계에서 사용)
	// setter는 반드시 호출할 필요가 없기 떄문
	
	public void setFlag(boolean flag) {
		this.flag = flag;
		log.info("setter injection으로 flag 주입받음.{}", flag);
	}
	
	public void setBar(Bar bar) {
		this.bar = bar;
		log.info("setter injection으로 bar 주입받음.{}", bar);
	}
	
	@PostConstruct
	public void initas() {
		log.info("init 메소드 실행. 시점을 확인할 것.");
	}
	
	@PreDestroy
	public void destroyas() {
		log.info("destroy 메소드 실행. 시점을 확인할 것.");
	}
	
}
