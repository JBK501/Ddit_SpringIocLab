package kr.or.ddit.lab08;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import kr.or.ddit.lab08.objs.ResourceComposite;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringJUnitConfig(locations = "file:src/main/resources/kr/or/ddit/lab08/conf/lab08-context.xml")
class Lab08PlaygroundTest {

//	@Resource(name = "resourceComposite")
	@Autowired
	ResourceComposite resCom;
	
	@Test
	void test() throws IOException {
		log.info("클래스 패스 자원크기 : {}\n 파일자원 크키 : {}\n url자원크키 : {}",
				resCom.getCpr().contentLength(),
				resCom.getFsr().contentLength(),
				resCom.getUrlR().contentLength()
		);
	}

}
