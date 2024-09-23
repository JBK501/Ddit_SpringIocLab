package kr.or.ddit.lab02.objs;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class Baz {
	public Baz() {
		log.info("{} 가 기본생정자로 생성됐음.", this.getClass().getSimpleName());
	}
}
