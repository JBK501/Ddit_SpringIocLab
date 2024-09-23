package kr.or.ddit.lab02.objs;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class Bar {
	
	public Bar() {
		log.info("{} 가 기본생정자로 생성됐음.", this.getClass().getSimpleName());
	}
	
}
